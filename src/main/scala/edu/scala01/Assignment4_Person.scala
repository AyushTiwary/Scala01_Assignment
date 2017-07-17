package edu.scala01

class Assignment4_Person(val name: String, val age: Int) extends Ordered[Assignment4_Person]{

  override def compare(that: Assignment4_Person): Int = {
    if(this.name.equals(that.name))
    {
      this.age - that.age
    }
    else this.name.length - that.name.length
  }
}