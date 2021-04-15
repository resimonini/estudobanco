package com.br.banco.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@Table(name="enderecos")
@Entity

public class Endereco {


    @Id
    private Long enderecoId;

    private String logradouro;
    private String bairro;
    private Integer cep;
    private Integer numero;
    private String complemento;
    private String cidade;
    private String estado;
}
