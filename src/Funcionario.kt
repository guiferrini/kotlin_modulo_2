open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    //    open fun bonificacao(): Double {
//        return salario * 0.1
//    }
//    open val bonificacao: Double get() = salario * 0.1 //property - com o GET n é possível alterar, PROTEÇÂO{
//    open fun getBonificacao(): Double = salario * 0.1 //function
    open val bonificacao: Double
        get() = salario * 0.1

}