package com.github.tcooling

/**
 * P11 (*) Modified run-length encoding.
 * Modify the result of problem P10 in such a way that if an element has no duplicates it is simply
 * copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
 * Example:
 * scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 * res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
 */
object P11 {

  def encodeModified[A](ls: List[A]): List[Any] = P10.encode(ls) map {
    case (1, element) => element
    case hasDuplicates => hasDuplicates
  }

  def encodeWithEither[A](ls: List[A]): List[Either[A, (Int, A)]] = P10.encode(ls) map {
    case (1, element) => Left(element)
    case hasDuplicates => Right(hasDuplicates)
  }

}
