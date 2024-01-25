import kotlin.math.round
import kotlin.math.roundToInt

/*Ejercicio 4.3
·Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para calcular el área y el perímetro.

·Opcionalmente se puede crear el método toString() para mostrar información sobre el rectángulo.

·En el programa principal, crear varios rectángulos y mostrar por pantalla sus áreas y perímetros.*/

class Rectangulo(val base : Double, val altura: Double){

    init {
        require(this.base > 0 && this.altura > 0){"La base y la altura deben ser mayores que cero"}
    }
    fun area(): String {
        return "%.2f".format(this.base * this.altura)
    }

    fun perimetro(): String {
        return "%.2f".format((this.base * 2) + (this.altura * 2))
    }

    override fun toString(): String{
        return "El área del rectángulo de base ${this.base}cm y altura ${this.altura}cm es ${area()}cm² y el perímetro es ${perimetro()}cm."
    }
}

