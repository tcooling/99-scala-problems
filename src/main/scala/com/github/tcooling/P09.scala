package com.github.tcooling

/**
 * P09 (**) Pack consecutive duplicates of list elements into sublists.
 * If a list contains repeated elements they should be placed in separate sublists.
 * Example:
 * scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 * res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
 */
object P09 {

  def pack[A](ls: List[A]): List[List[A]] = ls match {
    case Nil => Nil
    case head :: tail => List(head :: tail.takeWhile(_ == head)) ::: pack(tail.dropWhile(_ == head))
  }

  def packSpan[A](ls: List[A]): List[List[A]] = ls match {
    case Nil => List()
    case xs =>
      val (headItems, tail) = xs.span(_ == xs.head)
      if (tail == Nil) {
        List(headItems)
      } else {
        headItems :: packSpan(tail)
      }
  }

}
