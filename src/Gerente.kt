class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    //    function
//    override fun getBonificacao(): Double {
//        return super.getBonificacao() + salario
//    }

    //property
    override val bonificacao: Double
        get() {
            return super.bonificacao + salario
        }

    fun autenticacao(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }
}