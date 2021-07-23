package conta

interface MovimentacaoFinanceira {
    fun sacar(valor: Double)
    fun depositar(valor: Double)
    fun transferir(ContaBancariaDestino: Conta, valor: Double)
}