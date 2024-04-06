package hn.unah.lenguajes.Examen2.Examen2Unidad.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.Examen2.Examen2Unidad.Entities.Cliente;
import hn.unah.lenguajes.Examen2.Examen2Unidad.Repositories.ClienteRepository;
import hn.unah.lenguajes.Examen2.Examen2Unidad.Services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        String dni = cliente.getDni();
        if (this.clienteRepository.existsById(dni)) {
            return null;
        }
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerClientes() {
        return (List<Cliente>) this.clienteRepository.findAll();
    }

    @Override
    public Cliente obtenerClientePorDni(String dni) {
        return this.clienteRepository.findById(dni).get();
    }
}
