package com.example.envios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;




@RestController


public class EnviosController {
    private List<Envios> envios = new ArrayList<>();


    public EnviosController(){
        //Inicializar lista

        envios.add(new Envios("1", "Comida para Gatos", "Calle 123", "Enviado", "Centro de Distribucion"));
        envios.add(new Envios("2", "Comida para Perro", "Calle 1 norte", "Entregado", "Destino Final"));
        envios.add(new Envios("3", "Comida para Pollos", "Calle Libertad 124", "Enviado", "En Transito"));

    }

    @GetMapping("/envios")
    public List<Envios> getEnvios() {
        return envios;
    }
    
 
     
    public List<Envios> obtenerNuevosEnvios() {
        return envios.stream()
        .filter(envio ->!"Entregado".equals(envio.getEstado()))
        .collect(Collectors.toList());
    }   
    
    @GetMapping("/nuevos")
    public List<Envios> getEstado() {
        return obtenerNuevosEnvios();
    }
    

   

    
    
}
