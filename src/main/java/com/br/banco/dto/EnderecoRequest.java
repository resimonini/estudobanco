package com.br.banco.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class EnderecoRequest {

    @NotEmpty
    private String logradouro;

    @NotEmpty
    private String bairro;

    @NotNull
    private Integer cep;

    @NotNull
    private Integer numero;

    private String complemento;

    @NotEmpty
    private String cidade;

    @NotEmpty
    private String estado;
}
