package com.github.tcooling

import org.scalatest.{Matchers, WordSpecLike}

final class P05Test extends WordSpecLike with Matchers {

  "P05" should {
    "reverse a list" when {
      "the input list has one element" in {
        val input: List[Int] = List(1)
        P05.reverseBuiltIn(input) shouldBe input
        P05.reverseRecursive(input) shouldBe input
        P05.reverseTailRec(input) shouldBe input
        P05.reverseFoldLeft(input) shouldBe input
      }

      "the input list has no elements" in {
        val input: List[Int] = List.empty
        P05.reverseBuiltIn(input) shouldBe input
        P05.reverseRecursive(input) shouldBe input
        P05.reverseTailRec(input) shouldBe input
        P05.reverseFoldLeft(input) shouldBe input
      }

      "the input list has many elements" in {
        val input: List[Int] = List(1, 2, 3, 4, 5)
        val expected: List[Int] = List(5, 4, 3, 2, 1)
        P05.reverseBuiltIn(input) shouldBe expected
        P05.reverseRecursive(input) shouldBe expected
        P05.reverseTailRec(input) shouldBe expected
        P05.reverseFoldLeft(input) shouldBe expected
      }
    }
  }

}