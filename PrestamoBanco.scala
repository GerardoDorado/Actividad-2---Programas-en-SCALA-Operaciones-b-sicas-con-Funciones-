
import scala.io.StdIn._
object PrestamoBanco {
  def main(args: Array[String]): Unit = {
    obtencionDatosPersonale()
  }
  
  def obtencionDatosPersonale():Unit={
    println("Ingrese su nombre: ")
    val nombre=readLine()
    
    println("Historia credicticia: \n(b)Buena\n(m)Mala")
    val hc=readLine()
    
    println("Ingrese la cantidad del pedido: ")
    val pedido = readDouble()
    
    println("Ingrese su salario anual: ")
    val salarioAnual=readDouble()
    
    println("Valor de sus propiedades: ")
    val valorPropiedades=readDouble()
    
    calcularPrestamo(nombre, hc, pedido, salarioAnual, valorPropiedades)
  }
  
  def calcularPrestamo(nombre:String, hc:String, pedido:Double, salarioAnual:Double, valorPropiedades:Double):Unit={
    var puntos=0
    
    if(salarioAnual >= ((50*pedido)/100) ){
      puntos+=5
      println("5s")
    }
    
    if( (salarioAnual >= ((25*pedido)/100)) && (salarioAnual < ((50*pedido)/100) )){
      puntos+=3
      println("3")
    }
    
    if((salarioAnual >= ((10*pedido)/100)) && (salarioAnual < ((25*pedido)/100) )){
      puntos+=1
      println("1")
    }
    
    if(valorPropiedades>(pedido*2)){
      puntos+=5
      println("5v")
    }
    
    if(valorPropiedades<(pedido*2)&&valorPropiedades>=pedido){
      puntos+=3
      println("3v")
    }
    
    println(solicitudPedido(nombre, puntos, hc))
  }
  
  def solicitudPedido(nombre:String, puntos:Int, hc:String):String={
    var cadena=""
    if(hc.equals("b")){
      if(puntos>6){
        cadena="¡Felicidades señor(a):"+nombre+" el banco le aprobó el prestamo!. Con "+puntos+" puntos."
      }else{
        cadena="¡Lo sentimos señor(a):"+nombre+" el banco no puede otorgarle el prestamo!. Solo obtuvo "+puntos+" puntos."
      }
    }else{
      cadena="¡Lo sentimos señor(a):"+nombre+" el banco no puede otorgarle el prestamo!. Su historial credicticio es malo("+hc+")"
    }
    
    cadena
  }
}