package Zestaw2

case class Osoba(imie: String, nazwisko: String) {

  def powitanie(osoba: Osoba): String = osoba match {
    case Osoba("Ambrozy", "Rozek") => s"${osoba.imie}, witam Cie!"
    case Osoba("Czeslaw", "Kasztanek") => s"${osoba.nazwisko}, haslo okon!"
    case _ => s"Dzien dobry!"
  }
}