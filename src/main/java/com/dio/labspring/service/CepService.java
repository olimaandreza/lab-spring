package com.dio.labspring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dio.labspring.model.Endereco;

@FeignClient(name="viacep",url="http://viacep.com.br/ws")
public interface CepService {
    @RequestMapping(method=RequestMethod.GET,value="/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);
}
