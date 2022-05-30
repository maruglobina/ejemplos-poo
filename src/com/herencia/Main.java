package com.herencia;

import com.herencia.Gato;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Perro perro1 = new Perro("Firulais", 10.2);
        Gato gato1 = new Gato("Michi", 2.5);
        List<Mascota> mascotas = new ArrayList<>();
        mascotas.add(perro1);
        mascotas.add(gato1);

        System.out.println(gato1.maullar("Chester"));
        System.out.println(perro1.ladrar("Boby"));

        for (Mascota m : mascotas) {
            m.correr(1.3);
            m.comer("carne");
        }

    }
}