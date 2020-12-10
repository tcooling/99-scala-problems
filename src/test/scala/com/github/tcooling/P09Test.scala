package com.github.tcooling

import org.scalatest.{Matchers, WordSpecLike}

final class P09Test extends WordSpecLike with Matchers {

  private def runTest(f: List[Any] => List[List[Any]], functionName: String): Unit = {
    s"P09 $functionName" should {
      "pack consecutive duplicates of a list into their own lists" when {
        "the input list is empty" in {
          val input: List[Int] = List.empty
          f(input) shouldBe List.empty
        }

        "the input list has many consecutive duplicates" in {
          val input: List[Char] = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
          f(input) shouldBe List(
            List('a', 'a', 'a', 'a'),
            List('b'),
            List('c', 'c'),
            List('a', 'a'),
            List('d'),
            List('e', 'e', 'e', 'e')
          )
        }
      }
    }
  }

  runTest(P09.pack, functionName = "pack")
  runTest(P09.packSpan, functionName = "packSpan")

}