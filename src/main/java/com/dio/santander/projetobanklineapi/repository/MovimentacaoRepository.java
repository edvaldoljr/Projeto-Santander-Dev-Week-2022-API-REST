package com.dio.santander.projetobanklineapi.repository;

import com.dio.santander.projetobanklineapi.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {
}
