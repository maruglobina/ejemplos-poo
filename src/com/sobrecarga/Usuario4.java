package com.sobrecarga;

public class Usuario4 {
    String nombre;
    int edad;
    String direccion;

    /* El constructor de la clase Usuario4 esta sobrecargado */
    Usuario4( )
    {
        nombre = null;
        edad = 0;
        direccion = null;
    }

    Usuario4(String nombre, int edad, String direccion)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    Usuario4(Usuario4 usr)
    {
        nombre = usr.getNombre();
        edad = usr.getEdad();
        direccion = usr.getDireccion();
    }

    void setNombre(String n)
    {
        nombre = n;
    }

    String getNombre()
    {
        return nombre;
    }

    /* El metodo setEdad() está sobrecargado */
    void setEdad(int e)
    {
        edad = e;
    }

    void setEdad(float e)
    {
        edad = (int)e;
    }

    int getEdad()
    {
        return edad;
    }

    void setDireccion(String d)
    {
        direccion = d;
    }

    String getDireccion()
    {
        return direccion;
    }
}
