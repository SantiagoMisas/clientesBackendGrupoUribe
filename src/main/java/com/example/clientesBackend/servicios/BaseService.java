package com.example.clientesBackend.servicios;

import com.example.clientesBackend.entidades.Cliente;

import java.util.List;

public interface BaseService <E> {

    public List<E> listarClientes() throws Exception;

    public E encontrarPorId (Integer id) throws Exception;

    Cliente agregarCliente(Cliente entity) throws Exception;

    public boolean eliminarCliente(Integer id) throws Exception;
}
