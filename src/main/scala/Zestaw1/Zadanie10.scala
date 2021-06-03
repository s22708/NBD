package Zestaw1
import scala.math.abs


object Zadanie10 {
  def Zadanie10(lista: List[Double]): List[Double] = {
    lista.filter(wart => wart >= -5.0 && wart <= 12.0).map(abs)
  }
}
