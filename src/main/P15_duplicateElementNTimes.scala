package main

object P15_duplicateElementNTimes extends App {

  def duplicateNTimes[A](n: Int, l: List[A]): List[A] = {
    l.flatMap(x => List.fill(n)(x))
  }

  val myList = List('a', 'b', 'c')
  println(duplicateNTimes(3, myList))
}
