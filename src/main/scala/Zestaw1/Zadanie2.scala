package Zestaw1

object Zadanie2 {
  val dniTygdnia: List[String] = List("poniedzialek", "wtorek", "sroda", "czwartek", "piatek", "sobota", "niedziela")


  def zadanie2_a(dniTygodnia: List[String]): String = {
    if(dniTygodnia.isEmpty)
      ""
    else
      dniTygodnia.head + ", " + zadanie2_a(dniTygodnia.tail)
  }
  zadanie2_a(dniTygdnia)

  def zadanie2_b(dniTygodnia: List[String]): String = {
    if(dniTygodnia.isEmpty)
      ""
    else
      zadanie2_b(dniTygodnia.tail) + dniTygodnia.head + ", "
  }
}
