package com.github.tcooling

import scala.annotation.tailrec


/**
  * P02 (*) Find the last but one element of a list.
  * Example:
  * scala> penultimate(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 5
  */
object P02 {

  def penultimateBuiltIn[T](xs: List[T]): T = xs.init.last

  @tailrec
  def penultimateTailRec[T](xs: List[T]): T = xs match {
    case Nil => throw new NoSuchElementException
    case penultimate :: _ :: Nil => penultimate
    case _ :: tail => penultimateTailRec(tail)
  }

}
