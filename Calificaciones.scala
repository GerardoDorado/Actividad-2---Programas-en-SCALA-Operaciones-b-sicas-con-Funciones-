
import scala.io.StdIn._

object Calificaciones {
  def main(args: Array[String]): Unit = {
    lecturaCalificaciones()
  }
  
  def lecturaCalificaciones():Unit={
    var contador=1
    var calificaciones=0.0
    
    while(contador<=5){
      println("Ingresa la calificacion "+contador)
      var calificacion=readDouble()
      
      calificaciones+=calificacion
      contador+=1
    }
    
    determinarPromedio(calificaciones, contador)
  }
  
  def determinarPromedio(calificaciones:Double, contador:Int):Unit={
    println("Promedio: "+calificaciones/contador)
    
    val promedio = (calificaciones/contador)
    
    if(promedio>=90 && promedio<100){
      print("Excelente")
    }
    else if(promedio>=80 && promedio<89){
      print("Bien")
    }
    else if(promedio>=70 && promedio<79){
      print("Regular")
    }
    else if(promedio<=69){
      print("Terrible")
    }
  }
}