import scala.io.StdIn.readLine

object CalcularIMC {
    def main (args: Array[String]): Unit = {
        
        print ("Ingrese su peso: ")
        val peso = readLine().toDouble

        print("Ingrese su altura")
        val altura = readLine().toDouble

        val IMC = peso / (altura*altura) 

        println(s"Tu indice de masa corporal es: $IMC")
    }
}