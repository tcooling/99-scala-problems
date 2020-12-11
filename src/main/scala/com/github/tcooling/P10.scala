package com.github.tcooling

import scala.annotation.tailrec

/**
 *  P10 (*) Run-length encoding of a list.
 *  Use the result of problem P09 to implement the so-called run-length
 *  encoding data compression method.  Consecutive duplicates of elements are
 *  encoded as tuples (N, E) where N is the number of duplicates of the
 *  element E.
 *  Example:
 *  scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 *  res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
 */
object P10 {

  def encode[A](ls: List[A]): List[(Int, A)] = P09.pack(ls).map(x => (x.length, x.head))

  def encodeTailRec[A](ls: List[A]): List[(Int, A)] = {
    @tailrec
    def _encodeTailRec(xs: List[List[A]], result: List[(Int, A)]): List[(Int, A)] = xs match {
      case Nil => result
      case hs :: tail => _encodeTailRec(tail, result ::: List((hs.length, hs.head)))
    }

    _encodeTailRec(P09.pack(ls), Nil)
  }

}
