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
                        return repositorioCliente.saveAndFlush(entity);
                    }
                    catch(Exception error){
                        throw new Exception(error.getMessage());
                    }
    }


        @Override
        public Cliente editarCliente(Integer id, Cliente entity) throws Exception {
            try {
                Optional<Cliente> busquedaClientePorId = repositorioCliente.findById(id);

                if (busquedaClientePorId.isPresent()) {
                    Cliente getCliente = busquedaClientePorId.get();

                    getCliente.setTipoDeIdentificacion(entity.getTipoDeIdentificacion());
                    getCliente.setNumeroDeIdentificacion(entity.getNumeroDeIdentificacion());
                    getCliente.setPrimerNombre(entity.getPrimerNombre());
                    getCliente.setSegundoNombre(entity.getSegundoNombre());
                    getCliente.setPrimerApellido(entity.getPrimerApellido());
                    getCliente.setSegundoApellido(entity.getSegundoApellido());
                    getCliente.setFechaDeNacimiento(entity.getFechaDeNacimiento());
                    getCliente.setDireccion(entity.getDireccion());
                    getCliente.setNombreDeCiudad(entity.getNombreDeCiudad());
                    getCliente.setNombreDeDepartamento(entity.getNombreDeDepartamento());
                    getCliente.setNombreDePais(entity.getNombreDePais());
                    getCliente.setNombreDeMarca(entity.getNombreDeMarca());

                    return repositorioCliente.save(getCliente);
                }
                throw new Exception("El cliente no existe");
            } catch (Exception error) {
                throw new Exception(error.getMessage());
            }
        }


        @Override
        public boolean eliminarCliente(Integer id) throws Exception {
            try {
                repositorioCliente.deleteById(id);
                return true;
            } catch (Exception error) {
                throw new Exception(error.getMessage());
            }
        }


}

