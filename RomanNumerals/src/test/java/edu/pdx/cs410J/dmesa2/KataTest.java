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
  public void romanNumeral2For1isI(){
    assertThat(Kata.romanNumeralFor(2), equalTo("II"));
  }

  @Test
  public void romanNumeral3For1isI(){
    assertThat(Kata.romanNumeralFor(3), equalTo("III"));
  }

  @Test
  public void romanNumeral4For1isI(){
    assertThat(Kata.romanNumeralFor(4), equalTo("IIII"));
  }

  @Test
  public void romanNumeralFor5isV(){
       assertThat(Kata.romanNumeralFor(5), equalTo("V"));
  }

  @Test
  public void romanNumeralFor10isV(){
    assertThat(Kata.romanNumeralFor(10), equalTo("X"));
  }

}
