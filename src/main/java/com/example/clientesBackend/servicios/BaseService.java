package com.example.clientesBackend.servicios;

import java.util.List;

public interface BaseService <E> {

    public List<E> listarClientes() throws Exception;

    public E encontrarPorId (Integer id) throws Exception;

    public E agregarCliente(E entity) throws Exception;

    public E editarCliente(Integer id, E entity) throws Exception;

    public E eliminarCliente() throws Exception;

}
