package br.com.zup.autores

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller("/api/v1/autor")
class CadastroAutorController {

    @Post
    fun cadastro(@Body request: CadastroAutorRequest){
        println(request)
    }
}