package hn.unah.lenguajes.Examen2.Examen2Unidad.Controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.Examen2.Examen2Unidad.Entities.Movimientos;
import hn.unah.lenguajes.Examen2.Examen2Unidad.Services.Impl.MovimientoServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
@RequestMapping("/api/movimiento")
public class MovimientoController {

    @Autowired
    private MovimientoServiceImpl movimientoServiceImpl;

    @GetMapping("/obtenerMovimientoPorNumeroCuenta")
    public List<Movimientos>getMethodName(@RequestParam(name="numerocuenta") String numerocuenta) {
        return this.movimientoServiceImpl.obtenerMovimientoPorCuenta(numerocuenta);
    }
    
}
