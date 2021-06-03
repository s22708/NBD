package Zestaw1

object Zadanie4 {

  def zadanie4_a(dniTygodnia: List[String]): String = {
    val foldl_a = dniTygodnia.foldLeft("")(_ + _ + ", ")
    foldl_a
  }

  def zadanie4_b(dniTygodnia: List[String]): String = {
    val foldl_b = dniTygodnia.foldRight("")(_ + ", " + _)
    foldl_b
  }

  def zadanie4_c(dniTygodnia: List[String]): String = {
    val foldl_c = dniTygodnia.filter(_.startsWith("p")).foldLeft("")(_ + _ + ", ")
    foldl_c
  }

}
