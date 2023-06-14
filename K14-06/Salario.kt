fun main(args: Array<String>) {
   var Salario: Double = 1000.1
   var aumento: Double = (Salario/100)*15
   var impostos: Double = (Salario/100)*8
    
   var Salarioaum: Double = Salario+aumento 
   var Salariodes: Double = Salarioaum-impostos
    
    println("Seu salário é de $Salario, Seu salário com o aumento é $Salarioaum, Seu salário com desconto é de $Salariodes ")
   
}