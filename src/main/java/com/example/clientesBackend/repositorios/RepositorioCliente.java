package com.example.clientesBackend.repositorios;

import com.example.clientesBackend.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCliente extends JpaRepository<Cliente, Integer> {
}
