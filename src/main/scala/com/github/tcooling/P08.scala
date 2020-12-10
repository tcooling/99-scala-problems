package com.github.tcooling

import scala.annotation.tailrec


/**
 * P08 (**) Eliminate consecutive duplicates of list elements.
 * If a list contains repeated elements they should be replaced with a single copy of the element.
 * The order of the elements should not be changed.
 * Example:
 * scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 * res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
 */
object P08 {

  def compressRecursive[A](ls: List[A]): List[A] = ls match {
    case Nil => Nil
    case head :: tail => head :: compressRecursive(tail.dropWhile(_ == head))
  }

  def compressTailRec[A](ls: List[A]): List[A] = {
    @tailrec
    def _compressTailRec(xs: List[A], res: List[A]): List[A] = xs match {
      case Nil => res
      case head :: tail => _compressTailRec(tail.dropWhile(_ == head), res :+ head)
    }

    _compressTailRec(ls, Nil)
  }

  def compressFunctional[A](ls: List[A]): List[A] = ls.foldLeft(List[A]()) {
    case (xs, element) if xs.lastOption.contains(element) => xs
    case (xs, element) => xs :+ element
  }

}
