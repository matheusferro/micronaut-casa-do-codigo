package br.com.zup.autores

class DetalhesAutorResponse(autor: Autor) {
    val nome: String = autor.nome
    val email: String = autor.email
    val descricao: String = autor.descricao
}
