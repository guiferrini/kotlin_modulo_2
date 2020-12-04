fun testaComportamentosConta() {
    //    val conta = Conta()
//    conta.titular = "Gui"
//    conta.numero = 10
//    conta.saldo = 0.0
//
//    println(conta.titular)
//    println(conta.numero)
//    println(conta.saldo)
    val contaAlex = Conta("Alex", 1000)
    contaAlex.deposito(200.0)

    val contaFran = Conta("Fran", 1001)
    contaFran.deposito(300.0)

    println("Depositando na conta do ${contaAlex.titular}")
    contaAlex.deposito(10.0)
    println("Saldo na Conta: ${contaAlex.saldo}")
    println("-----")

    println("Depositando na conta do ${contaFran.titular}")
    contaFran.deposito(60.0)
    println("Saldo na Conta: ${contaFran.saldo}")
    println("-----")

    println("Sacando da conta do ${contaAlex.titular}")
    contaAlex.saca(20.0)
    println("Saldo na Conta: ${contaAlex.saldo}")
    println("-----")

    println("Sacando da conta do ${contaFran.titular}")
    contaFran.saca(400.0)
    println("Saldo na Conta: ${contaFran.saldo}")
    println("-----")

//    println("Transferindo da Conta ${contaAlex.titular} para Conta ${contaFran.titular}")
//    contaAlex.transfere(1000.0, contaFran)
//    println("Saldo Conta Alex: ${contaAlex.saldo}")
//    println("Saldo conta Fran: ${contaFran.saldo}")

    //Por retornar um Boolean o 'if' funciona/tem sentido
    if (contaAlex.transfere(10.0, contaFran)) {
        println("Transferencia efetuada com Sucesso")
    } else {
        println("Falha na transferencia")
    }
    println("Saldo Conta Alex: ${contaAlex.saldo}")
    println("Saldo conta Fran: ${contaFran.saldo}")

//    testalacos()
//     testaCondicaoSaldo(saldo)
}
