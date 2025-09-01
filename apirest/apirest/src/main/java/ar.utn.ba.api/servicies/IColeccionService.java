package ar.utn.ba.api.servicies;

import ar.utn.ba.api.models.dtos.ColeccionDto;
import ar.utn.ba.api.models.entities.Coleccion;

import java.util.List;

public interface IColeccionService {

    public void agregar(Coleccion coleccion);
    public List<ColeccionDto> obtenerColecciones();
    public Coleccion encontrarPorId(Long id);
    public void eliminar(Coleccion coleccion);
}
