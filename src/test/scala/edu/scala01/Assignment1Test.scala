package edu.scala01

import org.scalatest.FunSuite

class Assignment1Test extends FunSuite {

  test("tseting sum of digit of product method"){
    assert(new Assignment1().sumOfProduct(5) == 3)
  }

  test("testing sum of elements of list method"){
    assert(new Assignment1().sum(List(1,2,3)) == 6)
  }

}
