package com.br.banco.services.impl;

import com.br.banco.dto.EnderecoRequest;
import com.br.banco.models.Endereco;
import com.br.banco.repositories.EnderecoRepository;
import com.br.banco.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    public Endereco saveEndereco(EnderecoRequest enderecoRequest){
        if(enderecoRequest == null)
            return null;

        Endereco endereco = new Endereco(null, enderecoRequest.getLogradouro(), enderecoRequest.getBairro(),
                enderecoRequest.getCep(), enderecoRequest.getNumero(), enderecoRequest.getComplemento(),
                enderecoRequest.getCidade(), enderecoRequest.getEstado());

        return enderecoRepository.save(endereco);
    }
}
