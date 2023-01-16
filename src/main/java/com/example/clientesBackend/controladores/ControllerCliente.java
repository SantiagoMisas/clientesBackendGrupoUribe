package com.example.clientesBackend.controladores;

import com.example.clientesBackend.entidades.Cliente;
import com.example.clientesBackend.servicios.ServiceCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
@CrossOrigin
public class ControllerCliente {
    @Autowired
    ServiceCliente serviceCliente;
        @PostMapping
        public ResponseEntity<?> agregarCliente(@RequestBody Cliente cliente){
            try{
                    return ResponseEntity.status(HttpStatus.OK).body(serviceCliente.agregarCliente(cliente));
                }
            catch (Exception error){
                    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{Retificar el cuerpo de requerimiento}"+error);
                }

}
    @GetMapping
    public ResponseEntity<?> listarClientes(){
                try{
                        return ResponseEntity.status(HttpStatus.OK).body(serviceCliente.listarClientes());
                    }
                catch (Exception error){
                        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{Retificar el cuerpo del requerimiento}"+error);
                    }
}

}
