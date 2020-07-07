package com.github.tcooling

import java.util.NoSuchElementException


/**
  * P01 (*) Find the last element of a list.
  * Example:
  * scala> last(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 8
  */
object P01 {

  def lastBuiltIn[T](xs: List[T]): T = xs.last

  def lastRecursive[T](xs: List[T]): T = xs match {
    case Nil => throw new NoSuchElementException
    case last :: Nil => last
    case _ :: tail => lastRecursive(tail)
  }

}