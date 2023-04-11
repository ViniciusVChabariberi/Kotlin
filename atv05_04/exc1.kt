class Funcionario {
    
    var Nome : String = ""
    var Nasc : Int = 2006
    var salario : Double = 0.0

    fun informarSalario(){
        println("O salário do funcionário é de: $salario")
    }
    
    fun informarIdade(){
        val anoAtual = 2023
        val idade = anoAtual - Nasc
        
        println("A idade do funcionário é: $idade anos")
    }
    
    fun Andar(){
        println("Andando")
    }
    
    fun Falar(){
        println("Falando")
    }
    
    fun Beber(){
        println("Bebendo")
    }
    
    fun Comer(){
        println("Comendo")
    }
}

fun main(args: Array<String>){
	var func = Funcionario()
    
    func.salario = 5000.0
    
    func.informarSalario()
    func.informarIdade()
    
}