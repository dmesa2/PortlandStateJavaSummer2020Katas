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
      do {
        if (isNumeric(i)) {
          //System.out.println("number " + i);
          stack.push(i);
        } else {

          //System.out.println("val1 " + val1 + " val2 " + val2);
          if (i.equals("+")) {
            int val1 = Integer.parseInt(stack.pop().toString());
            int val2 = Integer.parseInt(stack.pop().toString());
            value = val2 + val1;
            stack.push(Integer.toString(value));
          } else if (i.equals("-")) {
            int val1 = Integer.parseInt(stack.pop().toString());
            int val2 = Integer.parseInt(stack.pop().toString());
            value = val2 - val1;
            stack.push(Integer.toString(value));
          } else if (i.equals("/")) {
            int val1 = Integer.parseInt(stack.pop().toString());
            int val2 = Integer.parseInt(stack.pop().toString());
            value = val2 / val1;
            stack.push(Integer.toString(value));
          } else if (i.equals("*")) {
            int val1 = Integer.parseInt(stack.pop().toString());
            int val2 = Integer.parseInt(stack.pop().toString());
            value = val2 * val1;
            stack.push(Integer.toString(value));
          } else if (i.equals("MAX")) {
            int val1 = Integer.parseInt(stack.pop().toString());
            int val2 = Integer.parseInt(stack.pop().toString());
            value = Math.max(val2, val1);
            //System.out.println("value " + value);
            stack.push(Integer.toString(value));

          } else if (i.equals("MIN")) {
            int val1 = Integer.parseInt(stack.pop().toString());
            int val2 = Integer.parseInt(stack.pop().toString());
            value = Math.min(val2, val1);
            stack.push(Integer.toString(value));
            //System.out.println("value " + value);
          }
          else if(i.equals("SQRT")){
            int val1 = Integer.parseInt(stack.pop().toString());
            value = (int) Math.sqrt(val1);
            stack.push(Integer.toString(value));
          }

        }
      }while(stack.isEmpty());
    }
    return Integer.parseInt(stack.pop());
  }
}
