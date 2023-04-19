fun main(args: Array<String>){
var altura : Double = 1.85
var peso : Double = 77.00
var imc : Double = Math.pow(altura, 2.00)/peso

	if(imc < 18){
        println("Sua condição é de magreza")
    } else if((imc <= 18.1) && (imc >= 24.9 )){
        println("Sua condição é saudável")
    } else if ((imc <= 25) && (imc >= 29.9)){
        println("Sua condição é sobrepeso")
    } else if (imc >= 30) {
        println("Sua condição é de Obesidade")
    }
}
