package com.example.facturacion.services;

import com.example.facturacion.models.Cliente;
import com.example.facturacion.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    // Obtener todos los clientes
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    // Obtener un cliente por ID
    public Cliente getClienteById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    // Crear un nuevo cliente
    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Actualizar un cliente existente
    public Cliente updateCliente(Long id, Cliente clienteActualizado) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        if (clienteOptional.isPresent()) {
            Cliente cliente = clienteOptional.get();
            // Suponiendo que 'Cliente' tiene métodos 'setNombre' y 'setEmail'
            cliente.setNombre(clienteActualizado.getNombre());
            cliente.setEmail(clienteActualizado.getEmail());
            return clienteRepository.save(cliente);
        } else {
            return null; // O lanzar una excepción si el cliente no se encuentra
        }
    }

    // Eliminar un cliente
    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
