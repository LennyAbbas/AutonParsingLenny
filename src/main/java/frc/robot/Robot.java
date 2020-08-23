package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {

  String exampleKey = "move,2,4"; // for move(distance 2, heading 4) or something like that

  // have fun trying to figure out what this code does
  // I'm only about 50% sure that it actually works
  private void convertKeyToFunction(String key) {
    final String parameterDivider = ",";
    int numberOfParameters = 1;
    String[] arrOfParameters;

    // splits the key into an array of strings such that the first string is a method and the following strings are parameters ex: "move" "2" "4"
    arrOfParameters = key.split(parameterDivider);

    // plugs the parameters into the methods (I used shoot and move as an example)
    if (arrOfParameters[0] == "shoot") {
      if (arrOfParameters.length == 1) { // no parameters
        shoot(); // pretend that theres actually a shoot method
      }
    }
    
    if (arrOfParameters[0] == "move") {
      if (arrOfParameters.length == 1) { // no parameters
        move(); // pretend that theres actually a move method
      } else if (arrOfParameters.length == 2) { // 1 parameter
        move(Double.parseDouble(arrOfParameters[1]));
      } else if (arrOfParameters.length == 3) { // 2 parameters
        move(Double.parseDouble(arrOfParameters[1]), Double.parseDouble(arrOfParameters[2]));
      }
    }
  }
}