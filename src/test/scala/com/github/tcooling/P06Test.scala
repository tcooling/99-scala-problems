package com.github.tcooling

import org.scalatest.{Matchers, WordSpecLike}

final class P06Test extends WordSpecLike with Matchers {

  "P06" should {
    "find out whether or not a list is a palindrome" when {
      "the input list is empty" in {
        val input: List[Int] = List.empty
        P06.isPalindromeBuiltIn(input) shouldBe true
        P06.isPalindromeTailRec(input) shouldBe true
      }

      "the input list is a palindrome" in {
        val input: List[Int] = List(1, 2, 2, 3, 4, 3, 2, 2, 1)
        P06.isPalindromeBuiltIn(input) shouldBe true
        P06.isPalindromeTailRec(input) shouldBe true
      }

      "the input list is not a palindrome" in {
        val input: List[Int] = List(1, 2, 2, 3, 4, 3, 9, 9, 1)
        P06.isPalindromeBuiltIn(input) shouldBe false
        P06.isPalindromeTailRec(input) shouldBe false
      }

      "the input list has one element" in {
        val input: List[Int] = List(1)
        P06.isPalindromeBuiltIn(input) shouldBe true
        P06.isPalindromeTailRec(input) shouldBe true
      }
    }
  }

}