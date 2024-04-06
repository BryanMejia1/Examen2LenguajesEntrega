package hn.unah.lenguajes.Examen2.Examen2Unidad.Controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.Examen2.Examen2Unidad.Entities.Direccion;
import hn.unah.lenguajes.Examen2.Examen2Unidad.Services.Impl.DireccionServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/direccion")
public class DireccionController {

    @Autowired
    private DireccionServiceImpl direccionServiceImpl;

    @PostMapping("/crearDireccion/{dni}")
    public Direccion postMethodName(@RequestBody Direccion direccion,
                                 @PathVariable(name="dni") String dni) {
        return this.direccionServiceImpl.crearDireccion(direccion, dni);
    }
    
}
