package com.github.tcooling

import org.scalatest.{Matchers, WordSpecLike}

final class P10Test extends WordSpecLike with Matchers {

  private def runTest(f: List[Char] => List[(Int, Char)], functionName: String): Unit = {
    s"P10 $functionName" should {
      "run length encode a list" when {
        "the input list is empty" in {
          val input: List[Char] = List.empty
          f(input) shouldBe List.empty
        }

        "the input list has many consecutive duplicates" in {
          val input: List[Char] = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
          f(input) shouldBe List(
            (4, 'a'),
            (1, 'b'),
            (2, 'c'),
            (2, 'a'),
            (1, 'd'),
            (4, 'e')
          )
        }
      }
    }
  }

  runTest(P10.encode[Char], functionName = "encode")
  runTest(P10.encodeTailRec[Char], functionName = "encodeTailRec")

}