package com.hotelweb.hotelapi.repository;
import com.hotelweb.hotelapi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}
