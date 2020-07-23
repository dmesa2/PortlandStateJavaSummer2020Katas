package edu.pdx.cs410J.dmesa2;

import java.util.Stack;

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

  public int calculator(String _input) {
    Stack<String> stack = new Stack<String>();
    String[] input = _input.split(" ");
    for (String i: input){
      stack.push(i);
    }
    return 0;
  }
}