
import scala.io.StdIn._
object A�oBisiesto {
  def main(args: Array[String]): Unit = {
    determinarA�oBisiesto()
  }
  
  def determinarA�oBisiesto():Unit={
    println("Ingresa el a�o")
    val a�o = readInt()
    
    println(comparacionA�o(a�o))
  }
  
  def comparacionA�o(a�o:Int):String={
    var cadena=""
    
    if(a�o%400==0){
      cadena= "A�o bisiesto"
    }
    if( ((a�o%4)==0) && !((a�o%100)==0) ){
      cadena = "A�o bisiesto"
    }else{
      cadena = "Este a�o no es bisiesto"
    }
    
    cadena
  }
}