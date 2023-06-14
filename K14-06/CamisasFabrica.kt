fun main(args: Array<String>) {
    var PrecoGrande: Int = 15
    var PrecoMedio: Int = 12
    var PrecoPequeno: Int = 10
    
    var QuantGrande: Int = 15
    var QuantMedio: Int = 10
    var QuantPequeno: Int = 12
    
    var QuantCamisetas: Int = QuantGrande+QuantMedio+QuantPequeno
    var Preco: Int = (PrecoGrande*QuantGrande)+(PrecoMedio*QuantMedio)+(PrecoPequeno*QuantPequeno)
    
    println("A quantidade de camisetas vendidas foi: $QuantCamisetas\n")

    println("O preço final das camisetas é: $Preco")
}