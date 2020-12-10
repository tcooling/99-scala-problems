package com.github.tcooling

import org.scalatest.{Matchers, WordSpecLike}

final class P07Test extends WordSpecLike with Matchers {

  private def runTest(f: List[Any] => List[Any], functionName: String): Unit = {
    s"P07 $functionName" should {
      "flatten a non nested list" when {
        "the input list is empty" in {
          val input: List[Int] = List.empty
          f(input) shouldBe List.empty
        }

        "the input list is not empty" in {
          val input: List[Int] = List(1, 2, 2, 3, 4, 3, 2, 2, 1)
          f(input) shouldBe input
        }

        "the input list includes a mix of types" in {
          val input: List[Any] = List(1, "2", 2d, true, '4', 3, 2, 2, 1)
          f(input) shouldBe input
        }
      }

      "flatten a nested list" when {
        "the list items are nested once" in {
          val input: List[Any] = List(1, List(1, 2), 2d, true, '4', List("a", "b"), 2, 2, 1)
          f(input) shouldBe List(1, 1, 2, 2d, true, '4', "a", "b", 2, 2, 1)
        }

        "the list items are nested multiple times" in {
          val input: List[Any] = List(1, List(1, 2), List(1, 2, List("3", 4, List())), List("a", List('b', List('c')), "b"))
          f(input) shouldBe List(1, 1, 2, 1, 2, "3", 4, "a", 'b', 'c', "b")
        }
      }
    }
  }

  runTest(P07.flattenBuiltIn, functionName = "flattenBuiltIn")
  runTest(P07.flattenRecursive, functionName = "flattenRecursive")
  runTest(P07.flattenTailRec, functionName = "flattenTailRec")

}