package Zestaw2

object Zadanie2_1 {

  def zadanie1(dzien: String): String = {
    val dniPracujace = List("poniedzialek", "wtorek", "sroda", "czwartek", "piatek")
    val dniWolne = List("sobota", "niedziela")

    dzien match {
      case dzien: String if dniPracujace.contains(dzien.toLowerCase()) => "Praca"
      case dzien: String if dniWolne.contains(dzien.toLowerCase()) => "Weekend"
      case _ => "Nie ma takiego dnia"
    }
  }
}
