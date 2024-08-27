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
        envios.add(new Envios("4", "Juguete para Gato", "Avenida Principal 567", "Enviado", "En Tránsito"));
        envios.add(new Envios("5", "Correa para Perro", "Calle Flores 891", "Preparando Envío", "No Iniciado"));
        envios.add(new Envios("6", "Arena para Gato", "Avenida Siempre Viva 742", "Entregado", "Destino Final"));
        envios.add(new Envios("7", "Cama para Perro", "Calle de los Olivos 101", "Enviado", "En Tránsito"));
        envios.add(new Envios("8", "Jaula para Hamster", "Boulevard Paseo del Norte 202", "Entregado", "Destino Final"));
        envios.add(new Envios("9", "Rascador para Gato", "Calle las Rosas 303", "Preparando Envío", "No Iniciado"));
        envios.add(new Envios("10", "Acuario", "Avenida del Sol 404", "Enviado", "En Tránsito"));
        envios.add(new Envios("11", "Collar GPS para Perro", "Calle Luna 505", "Entregado", "Destino Final"));
        
        

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
