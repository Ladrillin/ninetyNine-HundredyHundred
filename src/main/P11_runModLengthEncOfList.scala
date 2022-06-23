package main

import scala.annotation.tailrec

object P11_runModLengthEncOfList extends App {
  @tailrec
  def pack[A](list: List[A], result: List[List[A]] = Nil): List[List[A]] = {
    list match {
      case h :: tail => pack(tail.dropWhile(_ == h), result ++ List(list.takeWhile(_ == h)))
      case _ => result
    }
  }

  def runLength[A](l: List[A]): List[Any] =
    pack(l).map(el =>
      if (el.length == 1) el.head
      else (el.length, el.head))

  val myList = List('a', 'a', 'a', 'a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'd')
  println(runLength(myList))
}
