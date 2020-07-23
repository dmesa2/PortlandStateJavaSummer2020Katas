package edu.pdx.cs410J.dmesa2;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KataTest
{

  @Test
  public void outsideOneOperator(){
    String input = "20 5 /";
    Kata kata = new Kata();
    int result = kata.calculator(input);
    assertThat(result, equalTo(4));
  }

  @Test
  public void plusAdd(){
    String input = "20 5 +";
    Kata kata = new Kata();
    int result = kata.calculator(input);
    assertThat(result, equalTo(25));
  }

  @Test
  public void plusSub(){
    String input = "20 5 -";
    Kata kata = new Kata();
    int result = kata.calculator(input);
    assertThat(result, equalTo(15));
  }

  @Test
  public void plusMul(){
    String input = "20 5 *";
    Kata kata = new Kata();
    int result = kata.calculator(input);
    assertThat(result, equalTo(100));
  }

  @Test
  public void Max(){
    String input = "5 9 MAX";
    Kata kata = new Kata();
    int result = kata.calculator(input);
    assertThat(result, equalTo(9));
  }
  @Test
  public void Min(){
    String input = "5 9 MIN";
    Kata kata = new Kata();
    int result = kata.calculator(input);
    assertThat(result, equalTo(5));
  }
  
}
