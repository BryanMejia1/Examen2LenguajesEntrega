package hn.unah.lenguajes.Examen2.Examen2Unidad.Services;

import hn.unah.lenguajes.Examen2.Examen2Unidad.Entities.Cuentas;

public interface CuentaService {
    
    public Cuentas crearCuenta(Cuentas cuenta);

    public String asociarCuentaCliente(String dni, String numeroCuenta);
}
