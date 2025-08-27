package ar.utn.ba.api.servicies;

import ar.utn.ba.api.models.entities.Fuente;

public interface IFuenteServices {

    public void agregarFuenteDeColeccion(Fuente unaFuente, Long idColeccion);
    public void eliminarFuenteDeColeccion(Fuente unaFuente, Long idColeccion);
}
