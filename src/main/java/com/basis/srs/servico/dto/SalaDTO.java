package com.basis.srs.servico.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.List;


@Getter
@Setter
public class SalaDTO
{
    private Integer id;

    @NotNull
    private String descricao;

    @NotNull
    private Integer capacidadePessoas;

    @NotNull
    @Positive
    private Double precoDiario;

    @NotNull
    @Min(1)
    @Max(5)
    private Integer idTipoSala;


    private List<SalaEquipamentoDTO> equipamentos;
}
