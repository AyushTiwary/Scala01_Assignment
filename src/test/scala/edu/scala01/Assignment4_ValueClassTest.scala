package edu.scala01

import org.scalatest.FunSuite

class Assignment4_ValueClassTest extends FunSuite {

  test("testing display details method"){
    assert(new Assignment4_ValueClass().displayDetails(new FirstName("Divya"),
      new LastName("Dua"), new Age(21)) == "Divya Dua is of 21 years.")
  }

}
