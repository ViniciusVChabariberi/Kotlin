class Sobreposicao{
    
    fun quadrado(i : Int) : Int{
        return i*i
    }
    
    fun quadrado(f : Double) : Double{
        return f*f
    }
}

fun main(args: Array<String>) {
        var sobre = Sobreposicao()
        
        println("Quadrado de 3: ${sobre.quadrado(3)}")
       	println("Quadrado de 3.5: ${sobre.quadrado(3.5)}")
    }