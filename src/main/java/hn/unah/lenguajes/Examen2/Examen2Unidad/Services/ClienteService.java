package hn.unah.lenguajes.Examen2.Examen2Unidad.Services;

import hn.unah.lenguajes.Examen2.Examen2Unidad.Entities.Cliente;
import java.util.List;

public interface ClienteService {
    
    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> obtenerClientes();

    public Cliente obtenerClientePorDni(String dni);
}
