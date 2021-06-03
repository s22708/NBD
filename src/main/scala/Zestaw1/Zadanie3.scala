package Zestaw1

import scala.annotation.tailrec

object Zadanie3 {
  val dniTygdnia: List[String] = List("poniedzialek", "wtorek", "sroda", "czwartek", "piatek", "sobota", "niedziela")

  def zadanie3(dniTygodnia: List[String]): String = {
    @tailrec
    def zadanie3_wew(dniTygodnia: List[String], dniTygodniaZwracane: String): String = {
      dniTygodnia match {
        case Nil => dniTygodniaZwracane
        case rezultat :: tail => zadanie3_wew(tail, dniTygodniaZwracane + rezultat + ", ")
      }
    }
  zadanie3_wew(dniTygodnia, "")
  }
}
