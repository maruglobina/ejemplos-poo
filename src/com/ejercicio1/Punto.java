package com.ejercicio1;

public class Punto {

    private Integer _x;
    private Integer _y;

    public  Punto(Integer x, Integer y){
        this._x=x;
        this._y=y;
    }

    public Integer getX() {
        return _x;
    }
    public Integer getY(){
        return _y;
    }

    public void setX(Integer x){
        this._x=x;
    }
    public void setY(Integer y){
        this._y=y;
    }

    public Double distancia(Punto otro){
        //this <-- Este objeto
        //this._x <-- Es la coordenada X de este punto
        Integer difX = this._x-otro.getX();
        Integer difY = this._y-otro.getY();
        Double distancia = Math.sqrt(difX*difX+difY*difY);
        return  distancia;
    }

    public static Double distanciaEntrePuntos(Punto p1, Punto p2){
        Integer difX = p1._x-p2.getX();
        Integer difY = p1._y-p2.getY();
        Double distancia = Math.sqrt(difX*difX+difY*difY);
        return  distancia;
    }
}
