package edu.scala01

import org.scalatest.FunSuite

class SquareQueueTest extends FunSuite {

  test("testing enqueue method"){
    val queue = new SquareQueues(List(1,2,3))
    assert(queue.enqueue(4) == List(1,2,3,16))
  }

  test("testing dequeue method"){
    val queue = new SquareQueues(List(1,2,3))
    assert(queue.dequeue == List(2,3))
  }

}
