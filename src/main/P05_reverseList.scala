package main

import scala.annotation.tailrec

object P05_reverseList extends App {
  def reverseList[A](list: List[A]): List[A] = {
    list.reverse
  }

  def reverseListRecursion[A](list: List[A]): List[A] = {
    @tailrec
    def taliRec(result: List[A], list: List[A]): List[A] = {
      list match {
        case Nil => result
        case _ => taliRec(list.head :: result, list.tail)
      }
    }
    taliRec(List(), list)
  }

  val myList = List(1, 2, 3, 4, 5)
  println(reverseList(myList))
  println(reverseListRecursion(myList))
}
