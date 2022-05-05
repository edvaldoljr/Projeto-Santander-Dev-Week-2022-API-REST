package com.dio.santander.projetobanklineapi.controller;

import com.dio.santander.projetobanklineapi.dto.CorrentistaDto;
import com.dio.santander.projetobanklineapi.model.Correntista;
import com.dio.santander.projetobanklineapi.repository.CorrentistaRepository;
import com.dio.santander.projetobanklineapi.service.CorrentistaService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

    @Autowired
    private CorrentistaRepository correntistaRepository;

    @Autowired
    private CorrentistaService correntistaService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Correntista> findAll(){
        return correntistaRepository.findAll();
    }

    @PostMapping
    public void save(@RequestBody CorrentistaDto correntista){
        correntistaService.save(correntista);
    }
}
