package com.github.tcooling

import scala.annotation.tailrec


/**
  * P04 (*) Find the number of elements of a list.
  * Example:
  * scala> length(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 6
  */
object P04 {

  def lengthBuiltIn[T](xs: List[T]): Int = xs.length

  def lengthRecursive[T](xs: List[T]): Int = xs match {
    case Nil => 0
    case _ :: tail => 1 + lengthRecursive(tail)
  }

  def lengthTailRec[T](xs: List[T]): Int = {
    @tailrec
    def loop(ls: List[T], length: Int): Int = ls match {
      case Nil => length
      case _ :: tail => loop(tail, length + 1)
    }

    loop(xs, length = 0)
  }

}
