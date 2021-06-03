package Zestaw1

object Zadanie5 {

  def Zadanie5(): Map[String, Double] = {
    val produkty = Map("mleko" -> 2.49, "batonik" -> 2.99, "szyneczka" -> 16.99)
    produkty.mapValues(cena => cena * 0.9).toMap
  }
}
