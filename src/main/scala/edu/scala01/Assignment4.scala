package edu.scala01

class Assignment4 {

  //Finding element from Pascal's tree
  def pascal(c: Int, r: Int): Int = {
    if(c>r)
    {
      println("Column should be less than row")
      -1
    }
    else if(c==0 || c==r)
      1
    else
      pascal(c-1,r-1) + pascal(c,r-1)
  }

  //Using higher order functions, implement:
  //sum of squares, sum of cubes, sum of Ints
  def sum(f: (Int, Int) => Int,a: Int, b:Int): Int = {
    f(a,b)
  }

  def square(a: Int, b: Int) = a*a + b*b

  def cubes(a: Int, b: Int) = a*a*a + b*b*b

  def ints(a: Int, b: Int) = a + b
}
