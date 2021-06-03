package Zestaw1

object Zadanie7 {
  def zadanie7(numer: String): String = {
    val kontakty = Map(
      "Mama" -> "000-000-000",
      "Tata" -> "111-111-111",
      "Brat" -> "222-222-222",
      "Siostra" -> "333-333-333"
    )
    kontakty.getOrElse(numer, "")
  }
}