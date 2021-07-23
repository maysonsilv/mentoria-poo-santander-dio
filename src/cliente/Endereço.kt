package cliente

data class Endereço(
    val rua: String,
    val numero: Int,
    val bairro: String,
    val complemento: String? = null
)
