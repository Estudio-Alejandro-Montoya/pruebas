import scala.io.StdIn.readLine

object SumaNumeros {
  def main(args: Array[String]): Unit = {
    
    print("Ingrese un número: ")
    val numero1 = readLine().toInt

    
    print("Ingrese otro número: ")
    val numero2 = readLine().toInt

    
    val suma = numero1 + numero2

    
    println(s"La suma entre $numero1 y $numero2 es $suma")
  }
}

