package com.github.tcooling

import scala.annotation.tailrec


/**
  * P07 (**) Flatten a nested list structure.
  * Example:
  * scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  * res0: List[Any] = List(1, 1, 2, 3, 5, 8)
  */
object P07 {

  def flattenBuiltIn(ls: List[Any]): List[Any] = ls flatMap {
    case xs: List[_] => flattenBuiltIn(xs)
    case head => List(head)
  }

  def flattenRecursive(ls: List[Any]): List[Any] = ls match {
    case Nil => Nil
    case ((xs: List[Any]) :: tail) => flattenRecursive(xs) ::: flattenRecursive(tail)
    case (x :: xs) => x :: flattenRecursive(xs)
  }

  /**
   * Using underscore instead of Any due to type erasure, see link below for details
   * @see https://www.artima.com/pins1ed/case-classes-and-pattern-matching.html
   */
  def flattenTailRec(ls: List[Any]): List[Any] = {
    @tailrec
    def loop(xs: List[Any], res: List[Any]): List[Any] = xs match {
      case Nil => res
      case (hs: List[_]) :: Nil => loop(hs, res)
      case (hs: List[_]) :: tail => loop(tail, res ::: flattenTailRec(hs))
      case head :: tail => loop(tail, res :+ head)
    }

    loop(ls, Nil)
  }

}
