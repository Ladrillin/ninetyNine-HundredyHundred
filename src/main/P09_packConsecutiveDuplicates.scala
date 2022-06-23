package main

import scala.annotation.tailrec

object P09_packConsecutiveDuplicates extends App {
  @tailrec
  def pack[A](list: List[A], result: List[Any] = Nil): List[Any] = {
    list match {
      case h :: tail => pack(tail.dropWhile(_ == h), result ++ List(list.takeWhile(_ == h)))
      case _ => result
    }
  }

  val myList = List('a', 'a', 'a', 'a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'd')
  println(pack(myList))
}
