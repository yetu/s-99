package com.tecnoguru.s99

import scala.annotation.tailrec

object P01 {
  @tailrec
  def lastRec(lst: List[Int]): Int = {
    if (lst.length == 1) lst.head
    else lastRec(lst.tail)
  }

  def lastNonRec(lst: List[Int]): Int = {
    lst(lst.length - 1)
  }
}
