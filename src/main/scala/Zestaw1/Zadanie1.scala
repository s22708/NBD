package Zestaw1

object Zadanie1 {

  def zadanie1_a(): String = {
    val dniTygdnia: List[String] = List("poniedzialek", "wtorek", "sroda", "czwartek", "piatek", "sobota", "niedziela")
    var x = ""
    val przecinek = ", "

    for (dzien <- dniTygdnia) {
      x += dzien
      if (dzien != dniTygdnia) {
        x += przecinek
      }
    }
    x
  }

  def zadanie1_b(): String = {
    val dniTygdnia: List[String] = List("poniedzialek", "wtorek", "sroda", "czwartek", "piatek", "sobota", "niedziela")
    val dniTygodniaP = dniTygdnia.filter(_.toLowerCase().startsWith("p"))
    var x = ""
    val przecinek = ", "

    for (dzien <- dniTygodniaP) {
      x += dzien
      if (dzien != dniTygodniaP.last) {
        x += przecinek
      }
    }
    x
  }

  def zadanie1_c(): String = {
    val dniTygdnia: List[String] = List("poniedzialek", "wtorek", "sroda", "czwartek", "piatek", "sobota", "niedziela")
    var x = ""
    val przecinek = ", "
    val dlugoscListy = dniTygdnia.length
    var start = 0
    while (start < dlugoscListy) {
      x += dniTygdnia(start)
      if (start != dlugoscListy - 1) {
        x += przecinek
      }
      start += 1
    }
    x
  }
}
