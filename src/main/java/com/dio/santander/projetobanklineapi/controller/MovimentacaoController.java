package com.dio.santander.projetobanklineapi.controller;

import com.dio.santander.projetobanklineapi.dto.NovaMovimentacao;
import com.dio.santander.projetobanklineapi.dto.NovoCorrentista;
import com.dio.santander.projetobanklineapi.model.Movimentacao;
import com.dio.santander.projetobanklineapi.repository.MovimentacaoRepository;
import com.dio.santander.projetobanklineapi.service.CorrentistaService;
import com.dio.santander.projetobanklineapi.service.MovimentacaoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    @Autowired
    private MovimentacaoService movimentacaoService;

    @GetMapping
    public List<Movimentacao> findAll(){
        return movimentacaoRepository.findAll();
    }

    @GetMapping("/{idConta}")
    public List<Movimentacao> findAll(@PathVariable("idConta") Integer idConta){
        return movimentacaoRepository.findByIdConta(idConta);
    }
    @PostMapping
    public void save(@RequestBody NovaMovimentacao movimentacao){
        movimentacaoService.save(movimentacao);
    }

}
