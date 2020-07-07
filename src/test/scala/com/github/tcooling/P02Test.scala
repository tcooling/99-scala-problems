package com.github.tcooling

import org.scalatest.{Matchers, WordSpecLike}

final class P02Test extends WordSpecLike with Matchers {

  "P02" should {
    "get the penultimate item in a list" when {
      "multiple items are present in the list" in {
        val input: List[Int] = List(1, 2, 3, 4, 5)
        P02.penultimateBuiltIn(input) shouldBe 4
        P02.penultimateTailRec(input) shouldBe 4
      }

      "only two items are present in the list" in {
        val input: List[Int] = List(4, 5)
        P02.penultimateBuiltIn(input) shouldBe 4
        P02.penultimateTailRec(input) shouldBe 4
      }
    }

    "throw an exception" when {
      "the input list is empty" in {
        val input: List[Int] = List.empty
        assertThrows[UnsupportedOperationException](P02.penultimateBuiltIn(input))
        assertThrows[NoSuchElementException](P02.penultimateTailRec(input))
      }

      "there is only one element in the input list" in {
        val input: List[Int] = List(1)
        assertThrows[NoSuchElementException](P02.penultimateBuiltIn(input))
        assertThrows[NoSuchElementException](P02.penultimateTailRec(input))
      }
    }
  }

}