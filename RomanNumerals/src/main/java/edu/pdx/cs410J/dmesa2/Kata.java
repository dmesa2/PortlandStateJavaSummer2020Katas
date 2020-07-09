package edu.pdx.cs410J.dmesa2;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }

  public static String romanNumeralFor(int number){
    if(number < 5 ){
      StringBuilder sb = new StringBuilder();
      for ( int i = 0 ; i < number; i ++ ) {
        sb.append("I");
      }
      return sb.toString();
    }
    else if ( number == 5){
      return "V";
    }
    else {
      return "X";
    }
  }
}