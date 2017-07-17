package edu.scala01

import org.scalatest.FunSuite

class Assignment4_PersonTest extends FunSuite {

  test("testing ordered trait methods"){
    val person1 =  new Assignment4_Person("Divya", 21)
    val person2 =  new Assignment4_Person("Divya", 25)
    assert((person1 < person2) == true)
  }

  test("testing ordered trait methods again"){
    val person1 =  new Assignment4_Person("Divya", 21)
    val person2 =  new Assignment4_Person("Ritu", 25)
    assert((person1 < person2) == false)
  }

}
