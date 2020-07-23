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
  public void canInstantiateKataClass() {
    new Kata();
  }

}
