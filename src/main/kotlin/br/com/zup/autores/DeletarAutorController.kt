package br.com.zup.autores

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.PathVariable
import javax.transaction.Transactional

@Controller("/api/v1/autor/{id}")
class DeletarAutorController(val autorRepository: AutorRepository) {

    @Delete
    @Transactional
    fun deletar(@PathVariable id: Long): HttpResponse<Any>{
        var possivelAutor = autorRepository.findById(id)

        if(possivelAutor.isEmpty){
            return HttpResponse.notFound();
        }

        val autor = possivelAutor.get()
        autorRepository.delete(autor)

        return HttpResponse.ok()
    }
}