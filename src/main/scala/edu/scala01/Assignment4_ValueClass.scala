package edu.scala01

class FirstName(val firstName: String) extends AnyVal

class LastName(val lastName: String) extends AnyVal

class Age(val age: Int) extends AnyVal

class Assignment4_ValueClass {

  //displayDetails which take these three value classes FirstName, LastName and Age
  //as inputs and returns a string
  def displayDetails(f: FirstName, l: LastName, a: Age): String = {
    val f1 = f.firstName
    val l1 = l.lastName
    val a1 = a.age
    s"$f1 $l1 is of $a1 years."
  }

}
