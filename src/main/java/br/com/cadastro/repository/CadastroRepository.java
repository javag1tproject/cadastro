package br.com.cadastro.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.cadastro.models.Contato;

public interface CadastroRepository extends CrudRepository<Contato, Long> {

}
