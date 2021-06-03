package Zestaw2


object Zestaw2_Demo {
  def main(args: Array[String]): Unit = {

    //Zadanie1
    //    println(
    //      Zadanie2_1.zadanie1("Poniedzialek")
    //    )
    //    println(
    //      Zadanie2_1.zadanie1("Sobota")
    //    )
    //    println(
    //      Zadanie2_1.zadanie1("Wtornik")
    //    )

    //Zadanie2
    //    var kontoBankowe = new KontoBankowe()
    //    println(
    //      kontoBankowe.stanKonta
    //    )
    //    println(
    //      kontoBankowe.wplata(1000)
    //    )
    //    println(
    //      kontoBankowe.stanKonta
    //    )
    //    println(
    //      kontoBankowe.wyplata(900)
    //    )
    //    println(
    //      kontoBankowe.stanKonta
    //    )

    //Zadanie3
    var osoba1 = new Osoba("Ambrozy", "Rozek")
    var osoba2 = new Osoba("Czeslaw", "Kasztanek")
    var osoba3 = new Osoba("Szymon", "Kazula")

    println(osoba1.powitanie(osoba1))
    println(osoba2.powitanie(osoba2))
    println(osoba3.powitanie(osoba3))

    //Zadanie4
    println(
      Zadanie2_4.triple((value: Int) => value * value, 9)
    )

    val student = new Osoba1("Michal", "Nowak") with Student
    assert(student.podatek == 0)

  }
}
