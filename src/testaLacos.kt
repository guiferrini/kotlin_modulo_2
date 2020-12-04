fun testaLacos() {
    var i = 1
    while (i < 5) {
        val titular: String = "Gui"
        val numeroConta: Int = 10 + i // a conta n pretendo mudar, entao é 'val'
        var saldo: Double = 0.0 + i  // o saldo sim será laterado então é 'var'

        println("Conta #$i")
        println(" Titular $titular \n Número da Conta $numeroConta \n Saldo $saldo")
        println()
        i++
    }


//    for (i in 1..4) {
//        if(i == 3){
//            println("O '3' foi encontrado")
//            println()
////            break
//            continue
//        }
//
//        val titular: String = "Gui"
//        val numeroConta: Int = 10 + i // a conta n pretendo mudar, entao é 'val'
//        var saldo: Double = 0.0 + i  // o saldo sim será laterado então é 'var'
//
//        println("Conta #$i")
//        println(" Titular $titular \n Número da Conta $numeroConta \n Saldo $saldo")
//        println()
//    }
}
