package conta

abstract class Conta(val numero: Int,
                     val agencia: String) : MovimentacaoFinanceira {


                     private var _saldo: Double = 0.0
                     abstract fun taxa() : Double

        private fun temSaldo(valor: Double) : Boolean{
            return (_saldo >= valor)
        }

        fun getSaldo() : Double{
            return _saldo
        }

        override fun sacar(valor: Double){
            if (temSaldo(valor)) {
                _saldo -= valor
                println("Saque -> Valor: $valor")

            } else{
                println("Saque -> Não há saldo suficiente.")
            }

        }

        override fun depositar(valor: Double) {
             if (valor>0) {
                 _saldo += valor
                 println("Depósito -> Valor: $valor")

             } else{
                 println("Depósito -> Informe um valor válido para depositar")
             }

        }

        override fun transferir(ContaBancariaDestino: Conta, valor: Double){
            if(temSaldo(valor)){
                this.sacar(valor)
                ContaBancariaDestino.depositar(valor)
                println("Transferência -> Valor: $valor " +
                        "Conta origem: ${this.numero} Saldo total: ${this.getSaldo()}" +
                        "Conta destino: ${ContaBancariaDestino.numero} Saldo atual: ${ContaBancariaDestino.getSaldo()}".trimIndent())

            } else{
                println("Transferência -> Não foi possível realizar a transferência!")
            }
        }
}