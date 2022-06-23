package main

import scala.annotation.tailrec

object P12_decodeRunLength extends App {

  def decodeRunLength[A](l: List[(Int, A)]): List[Any] = {
    l.flatMap(el => List.fill(el._1)(el._2))
  }

  // <<< Encoder for testing
  @tailrec
  def pack[A](list: List[A], result: List[List[A]] = Nil): List[List[A]] = {
    list match {
      case h :: tail => pack(tail.dropWhile(_ == h), result ++ List(list.takeWhile(_ == h)))
      case _ => result
    }
  }

  def runLength[A](l: List[A]): List[(Int, A)] =
    pack(l).map(el => (el.length, el.head))

  val encodedList = runLength(List('a', 'a', 'a', 'a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'd'))
  // <<< End of encoder
  println(decodeRunLength(encodedList))
}
