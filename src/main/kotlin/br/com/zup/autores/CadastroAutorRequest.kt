package br.com.zup.autores

data class CadastroAutorRequest(
    val nome: String,
    val email: String,
    val descricao: String
)