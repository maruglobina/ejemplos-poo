package com.herencia;

public class Gato extends Mascota {

    public Gato (String nombre, Double peso){
        super(nombre, peso);
    }

    @Override
    public void correr(Double velocidad) {
        System.out.println(_nombre + " corre a la velocidad de " + velocidad * 3 + ". Y no lo alcanzan");
    }

    @Override
    public void comer(String comida) {
        System.out.println(_nombre + " come casi nada de " + comida);
    }

    public String maullar(String otroGatito){
        return "Soy "+_nombre+" y le estoy ladrando a "+otroGatito;
    }
}