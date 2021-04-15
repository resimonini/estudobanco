package com.br.banco.controllers;

import com.br.banco.dto.EnderecoRequest;
import com.br.banco.models.Endereco;
import com.br.banco.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    EnderecoService enderecoService;

    @PostMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public Endereco saveEndereco(@Valid @RequestBody EnderecoRequest enderecoRequest){

        return enderecoService.saveEndereco(enderecoRequest);
    }
}