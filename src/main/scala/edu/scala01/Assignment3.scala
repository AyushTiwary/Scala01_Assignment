package edu.scala01

class Assignment3 {

  //Given two lists of integers, list1 and list2.
  //Create a list of sums of the corresponding elements.
  def addList(l1:List[Int], l2: List[Int]):List[Int] = {
    val x = 0
    def add(l1:List[Int], l2:List[Int], l3:List[Int], x:Int): List[Int] = {
      if (x>=l1.length)
        l3
      else add(l1,l2,(l1(x)+l2(x)) :: l3,x+1)
    }
    val l3 = List[Int]()
    add(l1,l2,l3,x).reverse
  }

  //Fibonacci series till a given limit using tail recursion.
  def FibSeries(n: Int): List[Int] = {

    def fib(a: Int, b: Int, s: List[Int], n: Int, i: Int): List[Int] = {
      if(i > n-2)
        s
      else
        fib(b, a+b, s:::List(a+b),n,i+1)
    }

    if(n == 0)
      List(0)
    else fib(0,1,List(0,1),n,1)
  }

  // higher order function that takes three parameters with a function
  // to calculate area of rectangle, rhombus and parallelogram.
  def area(shape: String, first: Int, second: Int, f:(Int,Int, String) => Int):String ={
    val sh = if(!shape.isEmpty) shape.toLowerCase else ""
    val v = f(first,second,sh)
    sh match {
      case "rectangle" => s"Area of rectangle is $v"
      case "rhombus" => s"Area of rhombus is $v"
      case "parallelogram" => s"Area of parallelogram is $v"
      case _ => s"Enter some shape"
    }
  }

  def function(n1: Int, n2: Int, shape: String): Int = {
    val sh = if(!shape.isEmpty) shape else ""

    sh match {
      case "rectangle" => n1*n2
      case "rhombus" => n1*n2/2
      case "parallelogram" => n1*n2
      case _ => 0
    }
  }

  //Double all the elements of a list using map.
  def doubles(l: List[Int]): List[Int] = {
    l map(_*2)
  }

}
