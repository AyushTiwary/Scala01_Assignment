package edu.scala01

import org.scalatest.FunSuite

class Assignment2_BankingTest extends FunSuite {

  test("testing credit method"){
    assert(Assignment2_Banking(1, "Divya",0.0).credit(1000.0) == Assignment2_Banking(1,"Divya",1000.0))
  }

  test("testing debit method"){
    assert(Assignment2_Banking(1, "Ritu", 5000.0).debit(1000.0) == Assignment2_Banking(1,"Ritu",4000.0))
  }
}
