package Zestaw2

class KontoBankowe(private var _stanKonta: Double) {
  def stanKonta: Double = this._stanKonta

  private def stanKonta1(wartosc: Double): Unit = {
    this._stanKonta = wartosc
  }

  def this() {
    this(_stanKonta = 0)
  }

  def wplata(wartosc: Double): Unit = {
    this._stanKonta += wartosc
  }

  def wyplata(wartosc: Double): Unit = {
    this._stanKonta -= wartosc
  }
}
