package com.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class PuntoMain {

    public static void main(String []args){
      Punto p1 = new Punto(2,5); //this._x=2 this._y=5
      Punto p2 = new Punto(6,7); //this._x=6 this._y=7
      Punto p3 = new Punto(2,10); //this._x=2 this._y=10
      Punto p4 = new Punto(1,9); //this._x=1 this._y=9
      Double dis = p1.distancia(p2); //this --> p1 y otro=p2
      Double disre= p2.distancia(p1) ; //this --> p2 y otro=p1
      System.out.println("La distancia entre p1 y p2 es :"+ dis);
      System.out.println("La distancia entre p2 y p1 es :"+ disre);
      /*
      List<Punto> puntos  = new ArrayList<>();
      puntos.add(p1);
      puntos.add(p2);
      puntos.add(p3);
      puntos.add(p4);
      */
    }
}
