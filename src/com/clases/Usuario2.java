package com.clases;

public class Usuario2
{
    String nombre;
    int edad;
    String direccion;

    Usuario2( )     /* Equivale al contructor por omisión */
    {
        nombre = null;
        edad = 0;
        direccion = null;
    }

    Usuario2(String nombre, int edad, String direccion)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    Usuario2(Usuario2 usr)
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

    void setEdad(int e)
    {
        edad = e;
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