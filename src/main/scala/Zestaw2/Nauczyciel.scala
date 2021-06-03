package Zestaw2

trait Nauczyciel extends Pracownik {
  override def podatek: Double = this.pensja * 0.1

  val nauczyciel = new Osoba1("Włodzierz", "Włodzimierski") with Nauczyciel
  nauczyciel.pensja = 3000
  println(s"Name: ${nauczyciel.imie}, Lastname: ${nauczyciel.nazwisko}, Tax: ${nauczyciel.podatek}, Pensja: ${nauczyciel.pensja}")
}
