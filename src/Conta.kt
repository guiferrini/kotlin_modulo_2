class Conta(
    var titular: String,
    val numero: Int
) {  //1° letra maiúscula!
    //    var titular = "" //var (vai ser alterado0, "" (tenho q iniciar a variável/valor padrao)
//    var numero = 0
    var saldo = 0.0
        private set //apenas nossa classe consegue ajustar o saldo, com Deposito() ou Saque()
//        set(valor){
//            field = valor
//        }
//        get(){return field}

//    constructor(titular: String, numero: Int){ //construtor secuindario, primario é o q está com o nome da classe
//        this.titular = titular
//        this.numero = numero
//    }

    init{
        println("Init - Executa alguma coisa durante a construção.\n")
    }

    fun deposito(valor: Double) {
        if(valor > 0) {
            this.saldo += valor // this. -> estou mexendo com algo do proprio objeto - deixo claro
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        } else {
            println("ERRO. Você não tem saldo suficiente para efetuar esse saque.")
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean { //quem chama a função é a conta de origem
        if (saldo >= valor) {
            saldo -= valor
            destino.deposito(valor)
            return true
        } else {
            println("ERRO. Você não tem saldo suficiente para efetuar a Transferencia.")
            return false
        }
    }
//    //ENCAPSULAMENTO
//    fun getSaldo(): Double { //Protege o 'saldo', apenas a conta pode alterálo, e n qq pto do codigo/qq um
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        if(valor > 0){
//            saldo = valor
//        }
//    }
}