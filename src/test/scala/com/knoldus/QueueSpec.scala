package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class QueueSpec extends AnyFlatSpec {
   var queue=new Queue[Int](List(),List())

  "queue" should "be able to enqueue" in{
    val res=queue.enqueue(2).peek
    assert(res==2)
  }

  "queue" should "be able to dequeue" in{
    val res=queue.enqueue(4).enqueue(3).dequeue.peek
    assert(res==3)
  }

  "queue" should "be able to check empty" in{
    val res=queue.isEmpty
    assert(res==true)
  }

  "queue" should "be able to return empty head" in{
    assertThrows[NoSuchElementException]{
      queue.peek
    }
  }

  "queue" should "be able to print queue" in{
    val res=queue.toString
    assert(res=="Queue()")
  }

  "queue" should "be able to throw exception for dequeue" in{
    assertThrows[NoSuchElementException]{
      queue.dequeue
    }
  }
}
