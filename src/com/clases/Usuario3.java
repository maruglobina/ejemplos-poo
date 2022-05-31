package com.clases;

public class Usuario3
{
    static char MAS = 'm';
    static char FEM = 'f';

    String nombre;
    int edad;
    String direccion;
    char sexo;

    Usuario3( )
    {
        nombre = null;
        edad = 0;
        direccion = null;
        sexo = '\0';
    }

    Usuario3(String nombre, int edad, String direccion,char sexo)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.sexo = sexo;
    }

    Usuario3(Usuario3 usr)
    {
        nombre = usr.getNombre();
        edad = usr.getEdad();
        direccion = usr.getDireccion();
        sexo = usr.getSexo();
    }

    void setNombre(String n)
    {
        nombre = n;
    }

    String getNombre( )
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

    String getDireccion( )
    {
        return direccion;
    }

    void setSexo(char s)
    {
        sexo = s;
    }

    char getSexo( )
    {
        return sexo;
    }

    public String toString()
    {
        return nombre;
    }
}