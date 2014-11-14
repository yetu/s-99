package com.tecnoguru.s99

import org.specs2.mutable.Specification

class P02Spec extends Specification {
  "The P02 solution" should {
    "Find the one before last element in the list (recursive)" in {
      P02.penultimateRec(List(1, 1, 2, 3, 5, 8)) === 5
    }

    "Find the one before last element in the list (non-recursive)" in {
      P02.penultimateNonRec(List(1, 1, 2, 3, 5, 8)) === 5
    }
  }
}
