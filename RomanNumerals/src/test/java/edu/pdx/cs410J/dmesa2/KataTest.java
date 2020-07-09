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
  public void romanNumeralFor6isVI(){
    assertThat(Kata.romanNumeralFor(6), equalTo("VI"));
  }

  @Test
  public void romanNumeralFor7isVII(){
    assertThat(Kata.romanNumeralFor(7), equalTo("VII"));
  }

  @Test
  public void romanNumeralFor8isVIII(){
    assertThat(Kata.romanNumeralFor(8), equalTo("VIII"));
  }

  @Test
  public void romanNumeralFor9isVIIII(){
    assertThat(Kata.romanNumeralFor(9), equalTo("VIIII"));
  }

  @Test
  public void romanNumeralFor10isX(){
    assertThat(Kata.romanNumeralFor(10), equalTo("X"));
  }

  @Test
  public void romanNumeralFor11isX(){
    assertThat(Kata.romanNumeralFor(11), equalTo("XI"));
  }

  @Test
  public void romanNumeralFor12isX(){
    assertThat(Kata.romanNumeralFor(12), equalTo("XII"));
  }

  @Test
  public void romanNumeralFor13isX(){
    assertThat(Kata.romanNumeralFor(13), equalTo("XIII"));
  }


}
