package main

object P02_findLastButOne extends App {
  def findLastButOne[A](list: List[A]): A = {
//    list(list.size - 2)
    if (list.size < 2) throw new NoSuchElementException
    list.init.last
  }

  def findNthLastElement[A](list: List[A], n: Int = 0): A = {
    if (list.size < 2) throw new NoSuchElementException
//    list(list.size - n)
    list.takeRight(n).head
  }

  val myTestList = List(1, 2, 3, 4, "Hello", 6.55)
  println(findLastButOne(myTestList))
  println(findNthLastElement(myTestList, 1))
}
