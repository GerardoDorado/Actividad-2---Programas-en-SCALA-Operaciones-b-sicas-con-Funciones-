
import scala.io.StdIn._
object AñoBisiesto {
  def main(args: Array[String]): Unit = {
    determinarAñoBisiesto()
  }
  
  def determinarAñoBisiesto():Unit={
    println("Ingresa el año")
    val año = readInt()
    
    println(comparacionAño(año))
  }
  
  def comparacionAño(año:Int):String={
    var cadena=""
    
    if(año%400==0){
      cadena= "Año bisiesto"
    }
    if( ((año%4)==0) && !((año%100)==0) ){
      cadena = "Año bisiesto"
    }else{
      cadena = "Este año no es bisiesto"
    }
    
    cadena
  }
}