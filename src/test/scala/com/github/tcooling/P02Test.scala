package com.github.tcooling

import org.scalatest.{Matchers, WordSpecLike}

final class P02Test extends WordSpecLike with Matchers {

  "P01" should {
    "say hello" in {
      P01.hello() shouldBe "Hello"
    }
  }

}