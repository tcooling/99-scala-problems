package com.github.tcooling

import org.scalatest.{Matchers, WordSpecLike}

final class P11Test extends WordSpecLike with Matchers {

  "P11" should {
    "run length encode a list only for duplicates" when {
      "the input list is empty" in {
        val input: List[Char] = List.empty
        P11.encodeModified(input) shouldBe List.empty
        P11.encodeWithEither(input) shouldBe List.empty
      }

      "the input list has many consecutive duplicates and some single elements" in {
        val input: List[Char] = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
        P11.encodeModified(input) shouldBe List((4, 'a'), 'b', (2, 'c'), (2, 'a'), 'd', (4, 'e'))
        P11.encodeWithEither(input) shouldBe List(
          Right(4 -> 'a'),
          Left('b'),
          Right(2 -> 'c'),
          Right(2 -> 'a'),
          Left('d'),
          Right(4 -> 'e')
        )
      }
    }
  }
}