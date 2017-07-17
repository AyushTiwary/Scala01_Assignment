package edu.scala01

import org.scalatest.FunSuite

class Assignment4Test extends FunSuite {

  test("testing pascal method"){
    assert(new Assignment4().pascal(3,4) == 4)
  }

  test("testing pascal method again"){
    assert(new Assignment4().pascal(4,3) == -1)
  }

  test("testing sum of squares, cubes and ints method"){
    assert(new Assignment4().sum(new Assignment4().square, 5, 4) == 41)
  }

}
