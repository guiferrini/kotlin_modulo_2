class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
//    function
//    override fun getBonificacao(): Double {
//        return super.getBonificacao() + salario + plr
//    }

    //property
    override val bonificacao: Double
        get() {
            return super.bonificacao + salario + plr
        }

    fun autenticacao(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }
}