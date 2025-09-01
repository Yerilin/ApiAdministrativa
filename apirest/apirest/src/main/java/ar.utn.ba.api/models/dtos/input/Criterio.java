package ar.utn.ba.api.models.dtos.input;

import lombok.Data;

@Data
public class Criterio {

    private String tipo;
    private String operador;
    private String valor;
}
