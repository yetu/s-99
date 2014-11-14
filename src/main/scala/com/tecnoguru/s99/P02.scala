package com.tecnoguru.s99

import scala.annotation.tailrec

object P02 {
  def penultimateNonRec(lst: List[Int]): Int = {
    if (lst.length < 2) throw new IllegalArgumentException("List must have at least 2 elements")
    lst(lst.length - 2)
  }

  @tailrec
  def penultimateRec(lst: List[Int]): Int = {
    lst match {
      case Nil | _ :: Nil ⇒ throw new IllegalArgumentException("List must have at least 2 elements")
      case x :: _ :: Nil  ⇒ x
      case _ :: t         ⇒ penultimateRec(t)
    }
  }
}
