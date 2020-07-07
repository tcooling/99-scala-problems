package com.github.tcooling

import org.scalatest.{Matchers, WordSpecLike}

final class P04Test extends WordSpecLike with Matchers {

  "P04" should {
    "get the number of elements in the input list" when {
      "the input list has one element" in {
        val input: List[Int] = List(1)
        P04.lengthBuiltIn(input) shouldBe 1
        P04.lengthRecursive(input) shouldBe 1
        P04.lengthTailRec(input) shouldBe 1
      }

      "the input list has no elements" in {
        val input: List[Int] = List.empty
        P04.lengthBuiltIn(input) shouldBe 0
        P04.lengthRecursive(input) shouldBe 0
        P04.lengthTailRec(input) shouldBe 0
      }

      "the input list has many elements" in {
        val input: List[Int] = List(1, 2, 3, 4, 5)
        P04.lengthBuiltIn(input) shouldBe 5
        P04.lengthRecursive(input) shouldBe 5
        P04.lengthTailRec(input) shouldBe 5
      }
    }
  }

}