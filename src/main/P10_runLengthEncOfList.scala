package main

import scala.annotation.tailrec

object P10_runLengthEncOfList extends App {
  @tailrec
  def pack[A](list: List[A], result: List[List[A]] = Nil): List[List[A]] = {
    list match {
      case h :: tail => pack(tail.dropWhile(_ == h), result ++ List(list.takeWhile(_ == h)))
      case _ => result
    }
  }

  def runLength[A](l: List[A]): List[(Int, A)] =
    pack(l).map(el => (el.length, el.head))

  val myList = List('a', 'a', 'a', 'a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'd')
  println(runLength(myList))
}
