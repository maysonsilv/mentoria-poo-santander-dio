package cliente

import conta.Conta

class ClientePJ(
    endereço: Endereço,
    conta: Conta,
    val cnpj: String,
    val razaoSocial: String

) : Cliente(endereço, conta) {

    override fun imprimirDados() {
        println("Razão Social: $razaoSocial, Conta: ${conta.numero}, $endereço")
    }
}