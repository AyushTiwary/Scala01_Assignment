package edu.scala01

case class Assignment2_Banking(id: Int, name: String, balance: Double){

  require(id>0 && name != "")

  def credit(amount: Double): Assignment2_Banking = {
    new Assignment2_Banking(this.id, this.name, balance + amount)
  }

  def debit(amount: Double): Assignment2_Banking = {
    if (balance < amount) {
      println("Can't proceed, insufficient balance!")
      new Assignment2_Banking(this.id, this.name, balance)
    }
    else {
      new Assignment2_Banking(this.id, this.name, balance - amount)
    }
  }

}
