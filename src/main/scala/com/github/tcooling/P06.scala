package com.github.tcooling

import scala.annotation.tailrec


/**
  * P06 (*) Find out whether a list is a palindrome.
  * Example:
  * scala> isPalindrome(List(1, 2, 3, 2, 1))
  * res0: Boolean = true
  */
object P06 {

  def isPalindromeBuiltIn[T](xs: List[T]): Boolean = xs.reverse == xs

  @tailrec
  def isPalindromeTailRec[T](xs: List[T]): Boolean = xs match {
    case Nil => true
    case _ :: Nil => true
    case ls if ls.head == ls.last => isPalindromeTailRec(ls.tail.init)
    case _ => false
  }

}
