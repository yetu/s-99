package com.tecnoguru.s99

import org.specs2.mutable.Specification

class P01Spec extends Specification {
  "The P01 solution" should {
    "Find the last element of a list in a recursive way" in {
      P01.lastRec(List(1, 1, 2, 3, 5, 8)) === 8
    }

    "Find the last element of a list in a non-recursive way" in {
      P01.lastNonRec(List(1, 1, 2, 3, 5, 8)) === 8
    }
  }
}
