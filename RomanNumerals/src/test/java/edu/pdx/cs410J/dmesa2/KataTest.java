package edu.pdx.cs410J.dmesa2;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class KataTest
{

  @Test
  public void canInstantiateKataClass() {

    new Kata();
  }

  @Test
  public void romanNumeralFor1isI(){
    assertThat(Kata.romanNumeralFor(1), equalTo("I"));
  }

  @Test
  public void romanNumeralFor5isV(){
       assertThat(Kata.romanNumeralFor(5), equalTo("V"));
  }

}
