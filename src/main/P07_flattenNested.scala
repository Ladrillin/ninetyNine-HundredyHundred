package main

object P07_flattenNested extends App {
  def flattenList[A](list: List[A]): List[A] = {
    list flatten {
      case i: List[A] => flattenList(i)
      case e => List(e)
    }
  }

  def flatMapList(list: List[Any]): List[Any] = {
    list.flatMap {
      case i: List[Any] => flatMapList(i)
      case e => List(e)
    }
  }

  val myUnflattenList = List(1, 2, 3, List(1, 2, 3, List(1, 2)))
  println(flattenList(myUnflattenList))
  println(flatMapList(myUnflattenList))
}
