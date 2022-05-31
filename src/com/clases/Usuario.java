package com.clases;

/* Usuario.java */

class Usuario
{
    String nombre;
    int edad;
    String direccion;

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

