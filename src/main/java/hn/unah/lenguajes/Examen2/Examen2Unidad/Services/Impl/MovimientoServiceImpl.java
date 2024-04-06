package hn.unah.lenguajes.Examen2.Examen2Unidad.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.Examen2.Examen2Unidad.Entities.Cuentas;
import hn.unah.lenguajes.Examen2.Examen2Unidad.Entities.Movimientos;
import hn.unah.lenguajes.Examen2.Examen2Unidad.Repositories.CuentasRepository;
import hn.unah.lenguajes.Examen2.Examen2Unidad.Services.MovimientoService;

import java.util.List;

@Service
public class MovimientoServiceImpl implements MovimientoService {

    @Autowired
    private CuentasRepository cuentasRepository;

    @Override
    public List<Movimientos> obtenerMovimientoPorCuenta(String numerocuenta) {
        if (this.cuentasRepository.existsById(numerocuenta)) {
            Cuentas cuenta = this.cuentasRepository.findById(numerocuenta).get();
            List<Movimientos> movimiento = cuenta.getMovimientos();
            return movimiento;
        }
        return null;
    }
    
}
