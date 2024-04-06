package hn.unah.lenguajes.Examen2.Examen2Unidad.Services;

import hn.unah.lenguajes.Examen2.Examen2Unidad.Entities.Movimientos;
import java.util.List;

public interface MovimientoService {
    
    public List<Movimientos> obtenerMovimientoPorCuenta(String numerocuenta);
}
