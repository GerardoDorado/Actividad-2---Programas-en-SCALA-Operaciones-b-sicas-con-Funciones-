
import scala.io.StdIn._
object PantalonesDickies {
  def main(args: Array[String]): Unit = {
    calcularDescuentos()
  }
  
  def calcularDescuentos():Unit={
    println("=========>Bienvenidos a pantalones Dickies<=========")
    println("Ingresa la cantidad de pantalones a comprar")
    val cantidad=readInt()
    
    determinarDescuento(cantidad)
  }
  
  def determinarDescuento(cantidad:Int):Unit={
    if(cantidad<5){
      println("NO HAY DESCUENTO!!!")
      println("Cantidad a pagar: "+(cantidad*356.86))      
    }
    
    else if(cantidad>=5&&cantidad<12){
      println("Si hay descuento!")
      println("Descuento del: 15%")
      println("Precio ordinario: "+(cantidad*356.86))
      println("Descuento: "+(cantidad*(15*356.86)/100) )
      println("Cantidad a pagar: "+((cantidad*356.86)-(cantidad*(15*356.86)/100) ))
    }
    
    else if(cantidad>=12){
      println("Si hay descuento!")
      println("Descuento del: 30%")
      println("Precio ordinario: "+(cantidad*356.86))
      println("Descuento: "+(cantidad*(30*356.86)/100) )
      println("Cantidad a pagar: "+( (cantidad*356.86)-(cantidad*(30*356.86)/100) ))
    }
  }
}