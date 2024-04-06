package hn.unah.lenguajes.Examen2.Examen2Unidad.Controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes.Examen2.Examen2Unidad.Entities.Cliente;
import hn.unah.lenguajes.Examen2.Examen2Unidad.Services.Impl.ClienteServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/crearCliente")
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return this.clienteServiceImpl.crearCliente(cliente);
    }
    
    @GetMapping("/obtenerClientes")
    public List<Cliente> obtenerClientes() {
        return this.clienteServiceImpl.obtenerClientes();
    }

    @GetMapping("/obtenerClientePorDni/{dni}")
    public Cliente obtenerClientePorDni(@PathVariable String dni) {
        return this.clienteServiceImpl.obtenerClientePorDni(dni);
    }
    
}
