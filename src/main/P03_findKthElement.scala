package main

object P03_findKthElement extends App {
  def findKthElement[A](n: Int, list: List[A]): A = {
    if (list.length <= 0) throw new NoSuchElementException
    list(n)
  }

  val myTestList = List(1, 2, 3, 4, "Hello")
  println(findKthElement(4, myTestList))
}
