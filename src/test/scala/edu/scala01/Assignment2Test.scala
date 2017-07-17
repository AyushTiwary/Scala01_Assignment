package edu.scala01

import org.scalatest.FunSuite

class Assignment2Test extends FunSuite {

  test("testing find doubles method"){
    assert(new Assignment2().findDoubles("abbbbcccddaad") == "bbbbccddaa")
  }

}
