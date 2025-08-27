package ar.utn.ba.api.models.repository.imp;

import ar.utn.ba.api.models.entities.Coleccion;
import ar.utn.ba.api.models.repository.IColeccionRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ColeccionRepositoryMemo implements IColeccionRepository {

    private List<Coleccion> colecciones;


    @Override
    public void save(Coleccion coleccion) {

    }

    @Override
    public List<Coleccion> findAll() {

        return this.colecciones ;
    }

    @Override
    public Coleccion findById(Long id) {
        return null;
    }

    @Override
    public void delete(Coleccion coleccion) {

    }

}
