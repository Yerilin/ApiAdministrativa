package ar.utn.ba.api.servicies;

import ar.utn.ba.api.models.entities.Coleccion;

import java.util.List;

public interface IColeccionService {

    public void agregar(Coleccion coleccion);
    public List<Coleccion> obtenerTodos();
    public Coleccion encontrarPorId(Long id);
    public void eliminar(Coleccion coleccion);
}
