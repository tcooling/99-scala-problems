package com.github.tcooling

import org.scalatest.{Matchers, WordSpecLike}

final class P08Test extends WordSpecLike with Matchers {

  private def runTest(f: List[Any] => List[Any], functionName: String): Unit = {
    s"P08 $functionName" should {
      "eliminate consecutive duplicates of a list" when {
        "the input list is empty" in {
          val input: List[Int] = List.empty
          f(input) shouldBe List.empty
        }

        "the input list has no duplicate consecutive elements" in {
          val input: List[Int] = List(1, 2, 3, 4, 5)
          f(input) shouldBe input
        }

        "the input list has duplicate consecutive elements" in {
          val input: List[Int] = List(1, 1, 1, 2, 1, 3, 3, 3, 4, 5, 6)
          f(input) shouldBe List(1, 2, 1, 3, 4, 5, 6)
        }
      }
    }
  }

  runTest(P08.compressRecursive, functionName = "compressRecursive")
  runTest(P08.compressTailRec, functionName = "compressTailRec")
  runTest(P08.compressFunctional, functionName = "compressFunctional")

}