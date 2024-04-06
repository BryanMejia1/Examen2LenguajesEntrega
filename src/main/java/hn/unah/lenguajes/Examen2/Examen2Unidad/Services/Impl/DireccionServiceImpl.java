package hn.unah.lenguajes.Examen2.Examen2Unidad.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes.Examen2.Examen2Unidad.Entities.Cliente;
import hn.unah.lenguajes.Examen2.Examen2Unidad.Entities.Direccion;
import hn.unah.lenguajes.Examen2.Examen2Unidad.Repositories.ClienteRepository;
import hn.unah.lenguajes.Examen2.Examen2Unidad.Repositories.DireccionRepository;
import hn.unah.lenguajes.Examen2.Examen2Unidad.Services.DireccionService;

@Service
public class DireccionServiceImpl implements DireccionService{

    @Autowired
    private DireccionRepository DireccionRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Direccion crearDireccion(Direccion direccion, String dni) {
        if (this.clienteRepository.existsById(dni)) {
            Cliente cliente = this.clienteRepository.findById(dni).get();
            direccion.setCliente(cliente);
            return this.DireccionRepository.save(direccion);
        }
        return null;
    }
    
}
