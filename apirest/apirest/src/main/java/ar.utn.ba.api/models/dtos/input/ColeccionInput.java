package ar.utn.ba.api.models.dtos.input;
import ar.utn.ba.api.models.dtos.input.Criterio;
import lombok.Data;

import java.util.List;

@Data
public class ColeccionInput {

    private String tituloInput;
    private String descripcionInput;
    private String fuenteInput;
    private List<Criterio> condicionesInput;


}

