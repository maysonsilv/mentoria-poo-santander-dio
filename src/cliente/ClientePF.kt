package cliente

import conta.Conta

class ClientePF(
    endereço: Endereço,
    conta: Conta,
    val nome: String,
    val idade: Int,

) : Cliente(endereço, conta) {

    val segmento: Segmento
    get() = if (conta.getSaldo() >= 50){
        Segmento.VAN_GOGH
    } else{
        Segmento.CLASSICO
    }


    override fun imprimirDados() {
        println("Nome: $nome, Conta: ${conta.numero}, $endereço")
    }
}