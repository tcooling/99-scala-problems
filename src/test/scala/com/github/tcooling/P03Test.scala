package com.github.tcooling

import org.scalatest.{Matchers, WordSpecLike}

final class P03Test extends WordSpecLike with Matchers {

  "P03" should {
    "get the kth item in a list" when {
      "the kth item is the first item" in {
        val input: List[Int] = List(1, 2, 3, 4, 5)
        P03.kthBuiltIn(0, input) shouldBe 1
        P03.kthRecursive(0, input) shouldBe 1
      }

      "the kth item is the last item" in {
        val input: List[Int] = List(1, 2, 3, 4, 5)
        P03.kthBuiltIn(4, input) shouldBe 5
        P03.kthRecursive(4, input) shouldBe 5
      }
    }

    "throw an exception" when {
      "the list is empty" in {
        val input: List[Int] = List.empty
        assertThrows[IndexOutOfBoundsException](P03.kthBuiltIn(3, input))
        assertThrows[NoSuchElementException](P03.kthRecursive(3, input))
      }

      "the kth index is out of range" in {
        val input: List[Int] = List(1, 2, 3, 4, 5)
        assertThrows[IndexOutOfBoundsException](P03.kthBuiltIn(10, input))
        assertThrows[NoSuchElementException](P03.kthRecursive(10, input))
      }

      "the kth index is negative" in {
        val input: List[Int] = List(1, 2, 3, 4, 5)
        assertThrows[IndexOutOfBoundsException](P03.kthBuiltIn(-1, input))
        assertThrows[NoSuchElementException](P03.kthRecursive(-1, input))
      }
    }
  }

}