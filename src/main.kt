fun main() {
    println("*** Inicio ***")

    //testaComportamentosConta()
    val gui = Funcionario("Gui", "123", 1000.0)
    println("Nome: ${gui.nome}, CPF: ${gui.cpf}, Salario: ${gui.salario}")
    println("A Bonificação do Funcionário ${gui.nome} é ${gui.bonificacao}")
    println("---")

    val su = Gerente("Su", "456", 2000.0, 123)
    println("Nome: ${su.nome}, CPF: ${su.cpf}, Salario: ${su.salario}")
    println("A Bonificação do Funcionário ${su.nome} é ${su.bonificacao}")
    println("Autenricado: ${su.autenticacao(123)}")
    println("---")

    val ru = Diretor("Ru", "789", 4000.0, 456, 500.0)
    println("Nome: ${ru.nome}, CPF: ${ru.cpf}, Salario: ${ru.salario} e sua PLR é ${ru.plr}")
    println("A Bonificação do Funcionário ${ru.nome} é ${ru.bonificacao}")
    println("Autenricado: ${ru.autenticacao(456)}")
    println("---")
}


