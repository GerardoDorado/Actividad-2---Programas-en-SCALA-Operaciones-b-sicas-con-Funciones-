
import scala.io.StdIn._

object NumeroMes {
  def main(args: Array[String]): Unit = {
    determinarDiasMes()
  }
  
  def determinarDiasMes():Unit={
    println("Ingresa el numero del mes: ")
    val mes=readByte()
    
    mes match{
      case 1 => print("El mes es ENERO "+comparacion(mes))
      case 2 => print("El mes es FEBRERO "+comparacion(mes))
      case 3 => print("El mes es MARZO "+comparacion(mes))
      case 4 => print("El mes es ABRIL "+comparacion(mes))
      case 5 => print("El mes es MAYO "+comparacion(mes))
      case 6 => print("El mes es JUNIO "+comparacion(mes))
      case 7 => print("El mes es JULIO "+comparacion(mes))
      case 8 => print("El mes es AGOSTO "+comparacion(mes))
      case 9 => print("El mes es SEPTIEMBRE "+comparacion(mes))
      case 10 => print("El mes es OCTUBRE "+comparacion(mes))
      case 11 => print("El mes es NOVIEMBRE "+comparacion(mes))
      case 12 => print("El mes es DICIEMBRE "+comparacion(mes))
      case _ => print("Este no es un numero de mes valido!!!")
    }
  }
  
  def comparacion(mes:Int):Unit={
    if(mes.equals(1)||mes.equals(3)||mes.equals(5)||mes.equals(7)||mes.equals(8)||mes.equals(10)
        ||mes.equals(12)){
      println("31 dias")
    }else if(mes.equals(4)||mes.equals(6)||mes.equals(9)||mes.equals(11)){
      println("30 dias")
    }else if(mes.equals(2)){
      println("28 dias")
    }
  }
}