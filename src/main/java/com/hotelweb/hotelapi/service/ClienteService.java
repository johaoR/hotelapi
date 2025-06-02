package com.hotelweb.hotelapi.service;

import com.hotelweb.hotelapi.model.Cliente;
import com.hotelweb.hotelapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repo;

    public List<Cliente> listar() { return repo.findAll(); }
    public Cliente guardar(Cliente c) { return repo.save(c); }
    public Optional<Cliente> buscarPorId(Long id) { return repo.findById(id); }
    public void eliminar(Long id) { repo.deleteById(id); }
}
