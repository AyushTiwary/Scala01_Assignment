package edu.scala01

class Assignment1 {

  //sum of digits of product of number from 1 to n
  def sumOfDigits(n: Int): Int = {
    if(n == 0)
      0
    else n % 10 + sumOfDigits(n/10)
  }

  def product(n: Int): Int = {
    if(n == 0)
      1
    else n * product(n-1)
  }

  def sumOfProduct(n: Int): Int = {
    val num = product(n)
    sumOfDigits(num)
  }

  //sum of elements of list
  def sum(list: List[Int]): Int = {

    def sumRecursive(list: List[Int], sum: Int): Int = {
      if(list.isEmpty) {
        sum
      }
      else{
        sumRecursive(list.tail, list.head + sum)
      }
    }

    sumRecursive(list, 0)
  }

}
