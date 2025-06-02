package com.hotelweb.hotelapi.controller;

import com.hotelweb.hotelapi.model.Cliente;
import com.hotelweb.hotelapi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @GetMapping
    public List<Cliente> listarClientes() {
        return service.listar();
    }

    @PostMapping
    public Cliente registrarCliente(@RequestBody Cliente c) {
        return service.guardar(c);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarCliente(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> actualizarCliente(@PathVariable Long id, @RequestBody Cliente datos) {
        return service.buscarPorId(id).map(cli -> {
            cli.setNombre(datos.getNombre());
            cli.setCorreo(datos.getCorreo());
            cli.setTelefono(datos.getTelefono());
            service.guardar(cli);
            return ResponseEntity.ok(cli);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCliente(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
