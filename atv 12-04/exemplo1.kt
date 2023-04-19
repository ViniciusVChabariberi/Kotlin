fun main(args: Array<String>){
val horario : Double = 233.00

    if((horario >= 5.00) && (horario <= 12.59)){
        val turno = "manhã"
        println("Seu turno é de $turno");
    } else if((horario >= 13.00) && (horario <= 20.59)) {
        val turno = "tarde"
        println("Seu turno é de $turno");
    } else if((horario >= 21.00) && (horario <= 4.59)){
        val turno = "noite"
        println("Seu turno é de $turno");
    } else if(horario <= 23.59){
        val turno = "noite"
        println("Seu turno é de $turno");       
    } else if(horario >= 24.00){
        println("esse horário não existe")
    }
}