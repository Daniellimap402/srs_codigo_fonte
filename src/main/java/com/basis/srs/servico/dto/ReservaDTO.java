package com.basis.srs.servico.dto;

import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class ReservaDTO
{
    private Integer id;

    private LocalDate dataInicio;

    private LocalDate dataFim;

    private Double precoFinal;

    private Integer idCliente;

    private Integer idSala;

}