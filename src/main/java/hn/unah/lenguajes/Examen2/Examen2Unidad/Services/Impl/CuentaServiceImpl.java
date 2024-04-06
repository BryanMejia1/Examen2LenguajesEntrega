package hn.unah.lenguajes.Examen2.Examen2Unidad.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.Examen2.Examen2Unidad.Entities.Cliente;
import hn.unah.lenguajes.Examen2.Examen2Unidad.Entities.Cuentas;
import hn.unah.lenguajes.Examen2.Examen2Unidad.Repositories.ClienteRepository;
import hn.unah.lenguajes.Examen2.Examen2Unidad.Repositories.CuentasRepository;
import hn.unah.lenguajes.Examen2.Examen2Unidad.Services.CuentaService;

import java.util.List;

@Service
public class CuentaServiceImpl implements CuentaService {
    
    @Autowired
    private CuentasRepository cuentasRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cuentas crearCuenta(Cuentas cuenta) {
        String numeroCuenta = cuenta.getNumeroCuenta();
        if (this.cuentasRepository.existsById(numeroCuenta)) {
            return null;
        };
        double saldo = cuenta.getSaldo();
        if (saldo>500 || saldo == 500) {
            cuenta.setEstado(true);
            return this.cuentasRepository.save(cuenta);
        }
        return null;
    }

    @Override
    public String asociarCuentaCliente(String dni, String numeroCuenta) {
        if (this.clienteRepository.existsById(dni)) {
            if (this.cuentasRepository.existsById(numeroCuenta)) {
                List<Cliente> clientes = (List<Cliente>) this.clienteRepository.findAll();
                String estado = "disponible";
                Cuentas cuenta =this.cuentasRepository.findById(numeroCuenta).get();
                for (Cliente cliente : clientes) {
                    if (cliente.getCuentas().equals(cuenta)){
                        estado="false";
                    }
                }
                if (estado == "disponible") {
                    Cliente cliente = this.clienteRepository.findById(dni).get();
                    cuenta.setCliente(cliente);
                    return "Cuenta asociada con exito";
                }
                return "Cuenta ya pertenece a un Cliente";
            }
            return "La cuenta no existe";
        } 
        return "El cliente no existe";
    }
}
