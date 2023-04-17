class Externa{
   private val x = 7
    
    fun instanciaInterna(){
        var int = Interna()
        int.imprimeExterna()
    }    

inner class Interna { //inner acessa membros de outras classes
    fun imprimeExterna(){
        println("x vale $x")
    }
}
}

fun main(args: Array<String>) {
        var ext = Externa()
        
        ext.instanciaInterna()
    }