// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.knoldus

import scala.collection.Iterator
import scala.collection.immutable.List

/**
 * created a generic Queue class which takes two list parameters
 *
 * @param in
 * @param out
 * @tparam A
 */
class Queue[A](in: List[A], out: List[A]) {
  /**
   * function to add element in the Queue from backwards
   *
   * @param elem
   * @tparam B
   * @return
   */
  def enqueue[B >: A](elem: B): Queue[B] = new Queue[B](elem :: in, out)

  /**
   * function to remove front element from the queue
   *
   * @return
   */
  def dequeue: Queue[A] = out match {
    case Nil if !in.isEmpty => val rev = in.reverse; new Queue(Nil, rev.tail)
    case h :: xs => new Queue(in, xs)
    case _ => throw new NoSuchElementException
  }

  /**
   * function returns front element of the Queue
   *
   * @return
   */
  def peek: A =
    if (out.nonEmpty) {
      out.head
    }
    else if (in.nonEmpty) {
      in.last
    }
    else {
      throw new NoSuchElementException
    }

  /**
   * function checks if Queue is empty or not
   *
   * @return
   */
  def isEmpty: Boolean = in.isEmpty && out.isEmpty

  /**
   * function to iterate elements of Queue
   *
   * @return
   */
  def iterator: Iterator[A] = out.iterator.concat(in.reverse)

  /**
   * function to return elements of Queue object in string
   *
   * @return
   */
  override def toString: String = iterator.mkString("Queue(", ", ", ")")
}
