package Zestaw2

trait Pracownik extends Osoba1 {
  var _pensja: Double = 0;
  def pensja: Double = this._pensja
  def pensja_= (value: Double): Unit = this._pensja = value

  override def podatek: Double = this.pensja * 0.2
}
