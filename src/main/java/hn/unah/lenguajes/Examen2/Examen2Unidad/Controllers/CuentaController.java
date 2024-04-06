package hn.unah.lenguajes.Examen2.Examen2Unidad.Controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.Examen2.Examen2Unidad.Entities.Cuentas;
import hn.unah.lenguajes.Examen2.Examen2Unidad.Services.Impl.CuentaServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api/cuenta")
public class CuentaController {
    
    @Autowired
    private CuentaServiceImpl cuentaServiceImpl;

    @PostMapping("/crearCuenta")
    public Cuentas crearCuenta(@RequestBody Cuentas cuenta) {
        return this.cuentaServiceImpl.crearCuenta(cuenta);
    }

    @PutMapping("/asociarCuentaCliente/{dni}")
    public String putMethodName(@PathVariable String dni, 
                                @RequestParam(name="numerocuenta") String numerocuenta) {
        return this.cuentaServiceImpl.asociarCuentaCliente(dni, numerocuenta);
    }
    
}
