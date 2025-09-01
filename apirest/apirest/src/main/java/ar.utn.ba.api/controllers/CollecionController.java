package ar.utn.ba.api.controllers;

import ar.utn.ba.api.models.dtos.ColeccionDto;
import ar.utn.ba.api.models.dtos.input.ColeccionInput;
import ar.utn.ba.api.models.entities.Coleccion;
import ar.utn.ba.api.models.entities.Fuente;
import ar.utn.ba.api.servicies.IColeccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/coleccion")
public class CollecionController {

    @Autowired
    private IColeccionService coleccionService;

    @PostMapping
    public void agregarColeccion(@RequestBody ColeccionInput coleccion){

        Coleccion cole= new Coleccion();
        cole.setTitulo(coleccion.getTituloInput());
        cole.setFuente(new Fuente(coleccion.getFuenteInput()));
        cole.setDescripcion(coleccion.getDescripcionInput());
        //hacer un factory para crear las condiciones

        this.coleccionService.agregar(cole);


    }

    @GetMapping
    public List<ColeccionDto> obtenerColecciones(){

       return this.coleccionService.obtenerColecciones();

    }

}
