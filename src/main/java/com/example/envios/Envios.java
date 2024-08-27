package com.example.envios;

public class Envios {
    private String id;
    private String producto;
    private String direccion;
    private String estado;
    private String ubicacionActual;


    //constructor
    public Envios(String id, String producto, String direccion, String estado, String ubicacionActual){
        this.id = id;
        this.producto = producto;
        this.direccion = direccion;
        this.estado = estado;
        this.ubicacionActual = ubicacionActual;

    }

    //getters

    public String getId(){
        return id;
    }

    public String getProducto(){
        return producto;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getEstado(){
        return estado;
    }

    public String getUbicacionActual(){
        return ubicacionActual;
    }


}
