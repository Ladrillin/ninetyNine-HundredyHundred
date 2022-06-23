package main

object P06_isListPalindrome extends App {
  def isPalindrome[A](list: List[A]): Boolean = {
    list == list.reverse
  }

  val testListPositive = List(Nil, 1, 2, 3, 2, 1, Nil)
  val testListNegative = List(1, 2, 3)
  println(isPalindrome(testListPositive))
  println(isPalindrome(testListNegative))
}
