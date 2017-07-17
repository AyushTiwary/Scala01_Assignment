package edu.scala01

/**
  * Created by knoldus on 11/7/17.
  */

/*object TP extends App{
  val L = List(3,4,5,6,7,8)
  val d = new DoubleQueues(L)
  val s = new SquareQueues(L)
  println(d.enqueue(10))
}*/

trait queue {
  def dequeue:List[Int]
  def enqueue(x:Int):List[Int]
}

class DoubleQueues(l:List[Int]) extends queue{
  override def enqueue(x:Int) ={
    val l1 = l.reverse
    (2*x :: l1).reverse
  }
  override def dequeue = {
    l.tail
  }
}

class SquareQueues(l:List[Int]) extends queue{
  override def enqueue(x:Int) ={
    val l1 = l.reverse
    (x*x :: l1).reverse
  }
  override def dequeue = {
    l.tail
  }
}


