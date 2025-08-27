package ar.utn.ba.api.servicies;

import ar.utn.ba.api.models.dtos.ColeccionDto;
import ar.utn.ba.api.models.entities.Coleccion;
import ar.utn.ba.api.models.repository.IColeccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColeccionesServices implements IColeccionService {

    @Autowired
    private IColeccionRepository  colecciones;


    public List<ColeccionDto> obtenerColecciones(){
       return  this.colecciones.findAll().stream().map(this::ColeccionDto).toList();
    }

    private ColeccionDto ColeccionDto(Coleccion cole) {
        ColeccionDto coleout=new ColeccionDto();
        coleout.setNombre(cole.getName());
        return coleout;
    }


    public void addFuente(Long idCole, String rutaFuente){




    }

    @Override
    public void agregar(Coleccion coleccion) {

    }

    @Override
    public List<Coleccion> obtenerTodos() {
        return List.of();
    }

    @Override
    public Coleccion encontrarPorId(Long id) {
        return null;
    }

    @Override
    public void eliminar(Coleccion coleccion) {

    }
}
