package ar.utn.ba.api.controllers;

import ar.utn.ba.api.models.entities.Coleccion;
import ar.utn.ba.api.servicies.IColeccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/coleccion")
public class CollecionController {

    @Autowired
    private IColeccionService coleccionService;

    @GetMapping
    public List<Coleccion> obtenerColecciones(){

       return this.coleccionService.obtenerTodos();

    }

}
