package com.br.banco.services;

import com.br.banco.dto.EnderecoRequest;
import com.br.banco.models.Endereco;

public interface EnderecoService {

    Endereco saveEndereco(EnderecoRequest enderecoRequest);
}
