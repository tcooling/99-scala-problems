package com.github.tcooling

import scala.annotation.tailrec


/**
  * P03 (*) Find the Kth element of a list.
  * By convention, the first element in the list is element 0.
  * Example:
  * scala> nth(2, List(1, 1, 2, 3, 5, 8))
  * res0: Int = 2
  */
object P03 {

  def kthBuiltIn[T](k: Int, xs: List[T]): T = xs(k)

  @tailrec
  def kthRecursive[T](k: Int, xs: List[T]): T = (k, xs) match {
    case (0, head :: _) => head
    case (n, _ :: tail) => kthRecursive(n - 1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }

}
