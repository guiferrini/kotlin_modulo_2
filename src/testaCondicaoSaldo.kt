fun testaCondicaoSaldo(saldo: Double) {
    if (saldo > 0.0) {
        println("O Saldo da Conta é POSITIVA")
    } else if (saldo == 0.0) {
        println("O Saldo da Conta é NEUTRA")
    } else {
        println("O Saldo da Conta é NEGATIVA")
    }
//     when {
//         saldo > 0.0 -> println("O Saldo da Conta é POSITIVA")
//         saldo == 0.0 -> println("O Saldo da Conta é NEUTRA")
//         else -> println("O Saldo da Conta é NEGATIVA")
//     }
}