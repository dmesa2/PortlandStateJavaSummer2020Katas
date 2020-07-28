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
  public void Min(){
    String input = "5 9 1 3 MIN";
    Kata kata = new Kata();
    int result = kata.calculator(input);
    assertThat(result, equalTo(1));
  }

  @Test
  public void test1(){
    String input = "4 2 + 3 -";
    Kata kata = new Kata();
    int result = kata.calculator(input);
    assertThat(result, equalTo(3));
  }

  @Test
  public void test2(){
    String input = "3 5 8 * 7 + *";
    Kata kata = new Kata();
    int result = kata.calculator(input);
    assertThat(result, equalTo(141));
  }

  @Test
  public void Test3(){
    String input = "5 3 4 2 9 1 MAX";
    Kata kata = new Kata();
    int result = kata.calculator(input);
    assertThat(result, equalTo(9));
  }
  @Test
  public void Test4(){
    String input = "4 5 MAX 1 2 MAX *";
    Kata kata = new Kata();
    int result = kata.calculator(input);
    assertThat(result, equalTo(10));
  }
  @Test
  public void Test5(){
    String input = "9 SQRT";
    Kata kata = new Kata();
    int result = kata.calculator(input);
    assertThat(result, equalTo(3));
  }
}
