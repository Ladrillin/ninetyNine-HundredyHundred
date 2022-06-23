package main
import scala.annotation.tailrec

object P04_findSizeOfList extends App {
  def findSizeOfList[A](list: List[A]): Int = {
    list.size
  }

  def findSizeOfListByRecursion[A](list: List[A]): Int = {
    list match {
      case Nil => 0
      case _ => 1 + findSizeOfListByRecursion(list.tail)
    }
  }

  def findSizeOfListByFoldLeft[A](list: List[A]): Int = {
    list.foldLeft(0)((c, _) => c + 1)
  }

  def findSizeOfListByTailRecursion[A](list: List[A]): Int = {
    @tailrec
    def accumulator(result: Int = 0, list: List[A]): Int = {
      list match {
        case Nil => result
        case _ => accumulator(result + 1, list.tail)
      }
    }
    accumulator(list = list)
  }

  val myList = List()
  println(findSizeOfList(myList))
  println(findSizeOfListByRecursion(myList))
  println(findSizeOfListByFoldLeft(myList))
  println(findSizeOfListByTailRecursion(myList))
}
