package com.dio.santander.projetobanklineapi.dto;

import com.dio.santander.projetobanklineapi.model.MovimentacaoTipo;
import lombok.Data;

@Data
public class NovaMovimentacao {
    private String descricao;
    private Double valor;
    private MovimentacaoTipo tipo;
    private Integer idConta;
}