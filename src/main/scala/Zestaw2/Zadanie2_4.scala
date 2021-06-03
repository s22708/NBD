package Zestaw2

object Zadanie2_4 {

  def triple(function: Int => Int, value: Int): Int = {
    function(function(function(value)))
  }
}



