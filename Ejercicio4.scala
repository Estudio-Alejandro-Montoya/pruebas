import scala.io.StdIn.readLine

object CalcularEdad {
  def main(args: Array[String]): Unit = {
    
    print("Ingrese su nombre: ")
    val userName = readLine()

    
    print("Ingrese su año de nacimiento: ")
    val birthYear = readLine().toInt

    
    val currentYear = 2024

    
    val añosPersona = currentYear - birthYear

    
    println(s"Hola $userName, tienes $añosPersona años")
  }
}
