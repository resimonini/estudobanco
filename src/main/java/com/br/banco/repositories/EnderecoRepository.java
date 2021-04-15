package com.br.banco.repositories;

import com.br.banco.models.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
