class Pessoa{
    private var nome : String = ""
    protected var rg : String = ""
    private var cpf : String = ""
    var idade : Int = 0
    var endereco : String = ""
    var foneResidencial : String = ""
    var foneComercial : String = ""
    var celular : String = ""
    protected var nomePai : String = ""
    protected var nomeMae : String = ""
    protected var nomeConjuge : String = ""
    private var sexo : String = ""
    
    fun cadastrarPessoa() {
        println("Digite o seu nome: ")
        nome = readLine()?.toString()!!

        println("Digite o seu rg: ")
        rg = readLine()?.toString()!!

        println("Digite o seu cpf: ")
        cpf = readLine()?.toString()!!

        println("Digite a sua idade: ")
        idade = readLine()?.toInt()!!

        println("Digite o seu endereço: ")
        endereco = readLine()?.toString()!!

        println("Digite o número do seu telefone residencial: ")
        foneResidencial = readLine()?.toString()!!

        println("Digite o número do seu telefone comercial: ")
        foneComercial = readLine()?.toString()!!

        println("Digite o número do seu celular: ")
        celular = readLine()?.toString()!!

        println("Digite o nome do seu pai: ")
        nomePai = readLine()?.toString()!!

        println("Digite o nome da sua mãe: ")
        nomeMae = readLine()?.toString()!!

        println("Digite o nome do seu cônjuge: ")
        nomeConjuge = readLine()?.toString()!!

        println("Digite o seu sexo, m para masculino e f para feminino: ")
        sexo = readLine()?.toString()!!
    }
    
    fun listarCadastro() {
        println("Nome cadastrado: $nome")
        println("RG cadastrado: $rg")
        println("CPF cadastrado: $cpf")
        println("Idade cadastrada: $idade")
        println("Endereço cadastrado: $endereco")
        println("Telefone Residencial cadastrado: $foneResidencial")
        println("Telefone Comercial cadastrado: $foneComercial")
        println("Celular cadastrado: $celular")
        println("Nome do pai cadastrado: $nomePai")
        println("Nome da mãe cadastrada: $nomeMae")
        println("Nome do cônjuge cadastrado: $nomeConjuge")
        println("Sexo cadastrado: $sexo")
    }
}

fun main(args: Array<String>) {
		val cadastro = Pessoa()
        cadastro.cadastrarPessoa()
        cadastro.listarCadastro()
    }