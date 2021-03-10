package br.com.zup.autores

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import javax.transaction.Transactional
import javax.validation.Valid

@Validated
@Controller("/api/v1/autor")
class CadastroAutorController(val autorRepository: AutorRepository) {

    @Post
    @Transactional
    fun cadastro(@Body @Valid request: CadastroAutorRequest){
        println("Autor request: ${request}")
        val autor: Autor = request.paraAutor()
        println("Autor modelo: ${autor.nome}")
        autorRepository.save(autor)
    }
}