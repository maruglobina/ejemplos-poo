package com.herencia;

import com.herencia.Mascota;

public class Perro extends Mascota {

    public Perro (String nombre, Double peso){
        super(nombre, peso);
    }

    @Override
    public void correr(Double velocidad) {
        System.out.println(_nombre + " corre a la velocidad de " + velocidad * 2);
    }

    @Override
    public void comer(String comida) {
        System.out.println(_nombre + " come " + comida);
    }

    public String ladrar(String otroPerrito){
        return "Soy "+_nombre+" y le estoy ladrando a "+otroPerrito;
    }
}