package ar.utn.ba.api.models.repository;

import ar.utn.ba.api.models.entities.Fuente;

public interface IFuentesRepository {

    public void save(Fuente unaFuente, Long idColeccion);
    public void delete(Fuente unaFuente, Long idColeccion);
}
