package Zestaw1

object Zestaw1_Demo {
  def main(args: Array[String]): Unit = {
    val dniTygdnia: List[String] = List("poniedzialek", "wtorek", "sroda", "czwartek", "piatek", "sobota", "niedziela")
    val lista = List(-12.3, -5.9, 5.5, 6.1)

    //Zadanie1
    println("Zadanie1:")
    println(
      "Zadanie1_a" + "\n" +
      Zadanie1.zadanie1_a()
    )
    println()
    println(
      "Zadanie1_b" + "\n" +
       Zadanie1.zadanie1_b()
    )
    println()
    println(
      "Zadanie1_c" + "\n" +
      Zadanie1.zadanie1_c()
    )
    println()
    //Zadanie2
    println(
      "Zadanie2_a" + "\n" +
      Zadanie2.zadanie2_a(dniTygdnia)
    )
    println()
    println(
      "Zadanie2_b" + "\n" +
      Zadanie2.zadanie2_b(dniTygdnia)
    )
    println()
    println(
      "Zadanie3" + "\n" +
        Zadanie3.zadanie3(dniTygdnia)
    )
    println()
    println(
      "Zadanie4_a" + "\n" +
        Zadanie4.zadanie4_a(dniTygdnia)
    )
    println()
    println(
      "Zadanie4_b" + "\n" +
        Zadanie4.zadanie4_b(dniTygdnia)
    )
    println()
    println(
      "Zadanie4_c" + "\n" +
        Zadanie4.zadanie4_c(dniTygdnia)
    )
    println()
    println(
      "Zadanie5" + "\n" +
        Zadanie5.Zadanie5()
    )
    println()
    println(
        Zadanie6.Zadanie6("test", 2, 5.55)
    )
    println()
    println(
      "Zadanie7" + "\n" +
        Zadanie7.zadanie7("Mama") + "\n" +
        Zadanie7.zadanie7("Siostra")
    )
    println()
    println(
      "Zadanie10" + "\n" +
      Zadanie10.Zadanie10(lista)
    )
    println()

  }
}
