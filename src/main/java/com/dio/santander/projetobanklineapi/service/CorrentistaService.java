package com.dio.santander.projetobanklineapi.service;

import com.dio.santander.projetobanklineapi.dto.NovoCorrentista;
import com.dio.santander.projetobanklineapi.model.Conta;
import com.dio.santander.projetobanklineapi.model.Correntista;
import com.dio.santander.projetobanklineapi.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CorrentistaService {

    @Autowired
    private CorrentistaRepository correntistaRepository;

    public void save(NovoCorrentista correntistaDto){
        Correntista correntista = new Correntista();
        correntista.setCpf(correntistaDto.getCpf());
        correntista.setNome(correntistaDto.getNome());

        Conta conta = new Conta();
        conta.setSaldo(0.0);
        conta.setNumero(new Date().getTime());

        correntista.setConta(conta);
        correntistaRepository.save(correntista);
    }
}
