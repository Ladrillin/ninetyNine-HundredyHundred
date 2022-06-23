package main

object P01_findLastElement extends App {
  def findLastElementOfList[A](list: List[A]): A = {
    if (list.isEmpty) throw new NoSuchElementException
    list.last
  }

  val myList = List(1, 2, 3, 4, 5, "Hello", 6.55)
  println(findLastElementOfList(myList))
}
