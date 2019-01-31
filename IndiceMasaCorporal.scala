
import scala.io.StdIn._
object IndiceMasaCorporal {
  def main(args: Array[String]): Unit = {
    calcularMasaCorporal()
  }
  
  def calcularMasaCorporal():Unit={
    println("Ingresa tu peso en Kilogramos:")
    val kilogramos=readDouble()
    
    println("Ingresa tu estatura en centimetros:")
    val centimetros=readDouble()
    
    val masacorporal=(kilogramos/((centimetros/100)*2))
    determinarMasaCorporal(masacorporal)
  }
  
  def determinarMasaCorporal(masa:Double):Unit={
    println("Actualmente su masa corporal es de: "+masa )
    
    if(masa<16){
      println("Criterio de ingreso al hospital ")
    }else if(masa>=16&&masa<17){
      println("Infrapeso")
    }else if(masa>17&&masa<18){
      println("Bajo peso")
    }else if(masa>=18&&masa<25){
      println("Peso normal (saludable)"+masa)
    }else if(masa>=25&&masa<30){
      println("sobrepeso (obesidad de grado I)")
    }else if(masa>=30&&masa<35){
      println("sobrepeso crónico (obesidad de grado II)")
    }else if(masa>=35&&masa<40){
      println("obesidad premórbida (obesidad de grado III)")
    }else if(masa>=40){
      println("obesidad mórbida (obesidad de grado IV)")
    }
  }
}