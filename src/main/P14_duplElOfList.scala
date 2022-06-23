package main

object P14_duplElOfList extends App {

  def duplicateElements[A](l: List[A]): List[A] = {
    l.flatMap(x => List(x, x))
  }

  val myList = List('a', 'a', 'b', 'c')
  println(duplicateElements(myList))
}
