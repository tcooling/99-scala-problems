package com.github.tcooling

import org.scalatest.{Matchers, WordSpecLike}

final class P01Test extends WordSpecLike with Matchers {

  "P01" should {
    "return the last element in the list" when {
      "many items are in the list" in {
        P01.lastBuiltIn(List(1, 2, 3, 4, 5)) shouldBe 5
        P01.lastRecursive(List(1, 2, 3, 4, 5)) shouldBe 5
      }

      "one item is in the list" in {
        P01.lastBuiltIn(List(5)) shouldBe 5
        P01.lastRecursive(List(5)) shouldBe 5
      }
    }

    "throw an exception" when {
      "an empty list is input" in {
        assertThrows[NoSuchElementException](P01.lastBuiltIn(List.empty))
        assertThrows[NoSuchElementException](P01.lastRecursive(List.empty))
      }
    }
  }

}