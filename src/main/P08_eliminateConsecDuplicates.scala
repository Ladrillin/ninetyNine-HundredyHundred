package main
import scala.annotation.tailrec

object P08_eliminateConsecDuplicates extends App {
  def eliminateDuplicates[A](list: List[A]): List[A] = {
    list match {
      case Nil => Nil
      case h :: tail => h :: eliminateDuplicates(list.dropWhile(_ == h))
    }
  }

  @tailrec
  def recursiveEliminateDuplicates[A](result: List[A] = List(), list: List[A]): List[A] = {
    list match {
      case h :: tail => recursiveEliminateDuplicates(h :: result, tail.dropWhile(_ == h))
      case Nil => result.reverse
    }
  }

  val myList = List(1, 1, 1, 1, 2, 3, 4, 5, 1, 2, 3)
  println(eliminateDuplicates(myList))
  println(recursiveEliminateDuplicates(list = myList))
}
