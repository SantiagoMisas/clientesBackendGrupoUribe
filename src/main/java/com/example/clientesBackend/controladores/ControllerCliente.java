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
        @RequestMapping(path = "/save-client", method = RequestMethod.POST)
        public ResponseEntity<?> agregarCliente(@RequestBody Cliente cliente){
            try{
                    return ResponseEntity.status(HttpStatus.OK).body(serviceCliente.agregarCliente(cliente));
                }
            catch (Exception error){
                    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{Retificar el cuerpo de requerimiento}"+error);
                }

}
    @GetMapping
    @RequestMapping(path = "/list-client", method = RequestMethod.GET)
    public ResponseEntity<?> listarClientes(){
                try{
                        return ResponseEntity.status(HttpStatus.OK).body(serviceCliente.listarClientes());
                    }
                catch (Exception error){
                        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{Retificar el cuerpo del requerimiento}"+error);
                    }
}


    @RequestMapping(path = "/delete-client/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> eliminarCliente(@PathVariable Integer id) {
        try {
            serviceCliente.eliminarCliente(id);
            return ResponseEntity.status(HttpStatus.OK).body("El registro se ha eliminado correctamente"+ id);

        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("El registro no se ha podido eliminar: " + error);
        }
    }

    @GetMapping
    @RequestMapping(path = "/find-client/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> encontrarPorId(@PathVariable Integer id, @RequestBody Cliente cliente){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(serviceCliente.encontrarPorId(id));
        }
        catch (Exception error){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{El cliente no se ha encontrado}" + error);
        }
    }
    @RequestMapping(path = "/update-client/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> editarCliente(@PathVariable Integer id, @RequestBody Cliente cliente) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(serviceCliente.editarCliente(id, cliente));
        } catch (Exception error) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{El cliente no se ha encontrado}" + error);
        }

    }

}
