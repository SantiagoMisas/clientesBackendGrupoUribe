package com.example.clientesBackend.servicios;

import com.example.clientesBackend.entidades.Cliente;
import com.example.clientesBackend.repositorios.RepositorioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class ServiceCliente implements  BaseService<Cliente>{
    @Autowired
    RepositorioCliente repositorioCliente;

    @Override
    public List<Cliente> listarClientes() throws Exception {
                    try{
                        List<Cliente> clientes= repositorioCliente.findAll();
                        return clientes;
                        }

                    catch (Exception error){
                        throw new Exception(error.getMessage());
                        }
    }

    @Override
    public Cliente encontrarPorId(Integer id) throws Exception {
                    try{
                        Optional<Cliente> busquedaClientePorId=repositorioCliente.findById(id);
                        return busquedaClientePorId.get();
                    }
                    catch(Exception error){
                        throw new Exception(error.getMessage());
                    }
    }

    @Override
    public Cliente agregarCliente(Cliente entity) throws Exception {
                    try{
                        entity=repositorioCliente.save(entity);
                        return entity;
                    }
                    catch(Exception error){
                        throw new Exception(error.getMessage());
                    }
    }

    @Override
    public Cliente editarCliente(Integer id, Cliente entity) throws Exception {
                    try {
                            Optional<Cliente> busquedaClientePorId=repositorioCliente.findById(id);
                            Cliente cliente= repositorioCliente.save(entity);
                                return  cliente;
                    }
                    catch (Exception error){
                        throw new Exception(error.getMessage());
                    }
    }

    @Override
    public Cliente eliminarCliente() throws Exception {
                    return null;
    }


}

