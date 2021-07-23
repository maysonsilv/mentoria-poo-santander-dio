package cliente

import conta.Conta
abstract class Cliente(
    val endereço: Endereço,
    val conta: Conta
) {
   abstract fun imprimirDados()
}