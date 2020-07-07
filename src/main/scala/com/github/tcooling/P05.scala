package com.github.tcooling

import scala.annotation.tailrec


/**
  * P05 (*) Reverse a list.
  * Example:
  * scala> reverse(List(1, 1, 2, 3, 5, 8))
  * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  */
object P05 {

  def reverseBuiltIn[T](xs: List[T]): List[T] = xs.reverse

  def reverseRecursive[T](xs: List[T]): List[T] = xs match {
    case Nil => Nil
    case head :: tail => reverseRecursive(tail) :+ head
  }

  def reverseTailRec[T](xs: List[T]): List[T] = {
    @tailrec
    def loop(ls: List[T], result: List[T]): List[T] = ls match {
      case Nil => result
      case head :: tail => loop(tail, head :: result)
    }

    loop(xs, List.empty)
  }

  def reverseFoldLeft[T](xs: List[T]): List[T] = xs.foldLeft(List.empty[T]) {
    case (ls, x) => x :: ls
  }

}
