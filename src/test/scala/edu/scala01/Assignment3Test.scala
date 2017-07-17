package edu.scala01

import org.scalatest.FunSuite

class Assignment3Test extends FunSuite {

  test("testing method for adding elements of two lists"){
    assert(new Assignment3().addList(List(1,2,3),List(4,5,6)) == List(5,7,9))
  }

  test("testing fibonacci series method"){
    assert(new Assignment3().FibSeries(7) == List(0,1,1,2,3,5,8))
  }

  test("testing fibonacci series method for n=0"){
    assert(new Assignment3().FibSeries(0) == List(0))
  }

  test("testing area method") {
   assert(new Assignment3().area("rectangle", 3, 4, new Assignment3().function) == "Area of rectangle is 12")
  }

  test("testing doubles method"){
   assert(new Assignment3().doubles(List(1,2,3)) == List(2,4,6))
  }
}
