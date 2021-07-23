package conta

import cliente.ClientePF
import cliente.ClientePJ
import cliente.Endereço
import cliente.Segmento

fun main() {
    val conta = ContaPoupanca(123, "001")
    println("Saldo: ${conta.getSaldo()}")
    conta.depositar(50.00)
    println("Saldo: ${conta.getSaldo()}")
    println("Taxa: ${conta.taxa()}")

    val contaCorrente = ContaCorrente(321, "002")
    contaCorrente.depositar( 10.00)
    println("Saldo: ${contaCorrente.getSaldo()}")
    println("Taxa: ${contaCorrente.taxa()}")

    val endereco = Endereço("nova", 9, "sa viana")
    val endereco2 = endereco.copy(complemento = "Apto 01")

    val clienteMayson = ClientePF(endereco, conta, "Meyson", 23)
    clienteMayson.imprimirDados()

    val clienteSilva = ClientePJ(endereco2, contaCorrente, "CNPJ", "Razão Social" )
    clienteSilva.imprimirDados()

    println(clienteMayson.segmento)
}