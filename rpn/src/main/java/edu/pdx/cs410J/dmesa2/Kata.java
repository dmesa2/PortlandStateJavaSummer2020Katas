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

  public static boolean isNumeric(String strNum) {
    if (strNum == null) {
      return false;
    }
    try {
      double d = Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
      return false;
    }
    return true;
  }

  public int calculator(String _input) {
    Stack<String> stack = new Stack<String>();
    String[] input = _input.split(" ");
    int value=0;
    for (String i :input){
      if(isNumeric(i))
      {
        System.out.println("number "+ i);
        stack.push(i);
      }
      else
      {
        int val1 = Integer.parseInt(stack.pop().toString());
        int val2 = Integer.parseInt(stack.pop().toString());
        switch (i)
        {
          case "+":
            value = val2 + val1;
            stack.push(Integer.toString(value));
            break;

          case "-":
            value = val2 - val1;
            stack.push(Integer.toString(value));
            break;

          case "/":
            value = val2 / val1;
            stack.push(Integer.toString(value));
            break;

          case "*":
            value = val2 * val1;
            stack.push(Integer.toString(value));
            break;

          case "MAX":
            value = Math.max(val2,val1);
            stack.push(Integer.toString(value));
            stack.push("MAX");
            break;

          case "MIN":
            value = Math.min(val2,val1);
            stack.push(Integer.toString(value));
            stack.push("MIN");
            break;

        }
      }

    }
    return Integer.parseInt(stack.pop());
  }
}
