package com.herencia;

public abstract class Mascota {

    protected String _nombre;
    protected Double _peso;

    public Mascota (String nombre, Double peso){
        this._nombre = nombre;
        this._peso = peso;
    }

    public abstract void correr(Double velocidad);
    public abstract void comer(String comida);
}
