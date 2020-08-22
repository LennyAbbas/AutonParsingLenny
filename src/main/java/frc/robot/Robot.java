package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {

  // have fun trying to figure out what this code does
  // I'm only about 50% sure that it actually works
  private void convertKeyToFunction(String key) {
    final char parameterDivider = ',';
    int numberOfParameters = 1;
    String[] arrOfParameters;

    // figures out the number of parameters
    if (key.length() == 1) {
      numberOfParameters = 0;
    } else {
      for (int i = 0; i < key.length(); i++) {
        if (key.charAt(i) == parameterDivider) {
          numberOfParameters++;
        }
      }
    }

    // figures out what the parameters are
    if (numberOfParameters != 0) {
      arrOfParameters = key.split(Character.toString(parameterDivider));
    }

    // plugs the parameters into the methods (I used shoot and move as an example)
    if (key.charAt(0) == 's') {
      if (numberOfParameters == 0) {
        shoot(); // pretend that theres actually a shoot method
      }
    } else if (key.charAt(0) == 'm') {
      if (numberOfParameters == 0) {
        move(); // pretend that theres actually a move method
      } else if (numberOfParameters == 1) {
        move(Double.parseDouble(arrOfParameters[0]));
      } else if (numberOfParameters == 2) {
        move(Double.parseDouble(arrOfParameters[0]), Double.parseDouble(arrOfParameters[1]));
      }
    }
  }
}