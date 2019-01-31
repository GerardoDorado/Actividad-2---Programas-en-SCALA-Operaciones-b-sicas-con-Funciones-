
import scala.io.StdIn._
object AreaPerimetro {
  def main(args: Array[String]): Unit = {
    menu()
  }
  
  def menu():Unit={
    var opcion=""
    
    do{
      println("\n==========Bienvenido al menú==========")
      println("¿Con cual figura geometrica desea trabajar?")
      println("1) Circulo.")
      println("2) Rectangulo.")
      println("3) Triangulo.")
      println("4) Salir")
      opcion=readLine()
      
      opcion match{
        case "1" => obtenerAreaPerimetroCirculo()
        case "2" => obtenerAreaPerimetroRectangulo()
        case "3" => obtenerAreaPerimetroTriangulo()
        case "4" => println("¡Hasta luego!")
        case _=> println("No se encuentra esta opción.")
      }      
    }while(!opcion.equals("4"))     
  }
  
  def obtenerAreaPerimetroCirculo():Unit={
    var opcion=""
    do{
      println("\n--------------------------------------")
      println("=============== Circulo ===============")
      println("1) Obtener area del circulo.")
      println("2) Obtener perimetro del circulo.")
      println("3) Volver al menu principal.")
      opcion=readLine()
      
      opcion match{
        case "1" => calcularAreaCirculo()
        case "2" => calcularPerimetroCirculo()
        case "3" => println("")
        case _=>println("¡Opcion incorrecta!")
      }
    }while(!opcion.equals("3"))
  }
  
  def calcularAreaCirculo():Unit={
    println("Ingresa el radio del circulo: ")
    var radio = readDouble()
    
    println("Area: "+math.Pi*(math.pow(radio, 2)))
  }
  
  def calcularPerimetroCirculo():Unit={
    println("Ingresa el radio del circulo: ")
    val radio = readDouble()
    
    println("Perimetro: "+2*math.Pi*radio)
  }
  
  def obtenerAreaPerimetroTriangulo():Unit={
    var opcion=""
    do{
      println("\n--------------------------------------")
      println("============== Triangulo ===============")
      println("1) Obtener area del triangulo.")
      println("2) Obtener perimetro del triangulo.")
      println("3) Volver al menu principal.")
      opcion=readLine()
      
      opcion match{
        case "1"=>calcularAreaTriangulo()
        case "2"=>calcularPerimetroTriangulo()
        case "3"=>println()
        case _=>println("¡Opcion incorrecta!")
      }
    }while(!opcion.equals("3"))
  }
  
  def calcularAreaTriangulo():Unit={
    println("Ingresa la altura del triangulo: ")
    val altura = readDouble()
    
    println("Area: "+(altura*altura)/2)
  }
  
  def calcularPerimetroTriangulo():Unit={
    println("Ingresa la altura del triangulo: ")
    val altura = readDouble()
    
    println("Perimetro: "+3*altura)
  }
  
  def obtenerAreaPerimetroRectangulo():Unit={
    var opcion=""
    do{
      println("\n--------------------------------------")
      println("============== rectangulo ===============")
      println("1) Obtener area del rectangulo.")
      println("2) Obtener perimetro del rectangulo.")
      println("3) Volver al menu principal.")
      opcion=readLine()
      
      opcion match{
        case "1"=>calcularAreaRectangulo()
        case "2"=>calcularPerimetroRectangulo()
        case "3"=>println()
        case _=>println("¡Opcion incorrecta!")
      }
    }while(!opcion.equals("3"))
  }
  
  def calcularAreaRectangulo():Unit={
    println("Ingresa la base del rectangulo: ")
    val altura=readDouble()
    
    println("Ingresa la altura del rectangulo: ")
    val base=readDouble()
    
    println("Area: "+altura*base)
  }
  
  def calcularPerimetroRectangulo():Unit={
    println("Ingresa la base del rectangulo: ")
    val altura=readDouble()
    
    println("Ingresa la altura del rectangulo: ")
    val base=readDouble()
    
    println("Perimetro: "+2*(altura+base))
  }
}