package com.clases;

public class EjemploMetodosDeClaseMain {
    static int NUM_USUARIOS = 0;
    static java.util.Vector usuarios = new java.util.Vector();

    String nombreObj = null;

    EjemploMetodosDeClaseMain(String nombre)
    {
        this.nombreObj = nombre;
    }

    static int getNumUsuarios()
    {
        return NUM_USUARIOS;
    }

    static void imprimeUsuario(Usuario3 usr)
    {
        System.out.println("\nNombre: " + usr.nombre );
        System.out.println("Edad: " + usr.getEdad() );
        System.out.println("Sexo: " + usr.getSexo() );
        System.out.println("Direccion: " + usr.getDireccion() );
    }

    void addUsuario(Usuario3 usr)
    {
        usuarios.addElement(usr);
        System.out.print(usr.toString( )+ " agregado por el "+ this.toString() +",");
        NUM_USUARIOS ++;
    }

    void delUsuario(Usuario3 usr)
    {
        boolean b = usuarios.removeElement(usr);
        if( b == true )
        {
            NUM_USUARIOS--;
            System.out.print(usr.toString( )+ " eliminado por el "+ this.toString() +",");
        }
        else System.out.println("No se pudo eliminar al usuario.");
    }

    public String toString()
    {
        return nombreObj;
    }

    public static void main(String args[])
    {
        EjemploMetodosDeClaseMain obj1 = new EjemploMetodosDeClaseMain("objeto1");
        EjemploMetodosDeClaseMain obj2 = new EjemploMetodosDeClaseMain("objeto2");

        Usuario3 usr1,usr2,usr3,usr4;

        usr1 = new Usuario3( );
        usr2 = new Usuario3("Usuario B",24,"La direccion A",Usuario3.FEM);
        usr1 = new Usuario3(usr2);
        usr1.setNombre("Usuario A");
        usr3 = new Usuario3("Usuario C",35,"La direccion C",Usuario3.MAS);
        usr4 = new Usuario3("Usuario D",15,"La direccion D",Usuario3.MAS);

        obj1.addUsuario(usr1);
        System.out.println( "\t Total: " +EjemploMetodosDeClaseMain.getNumUsuarios() );
        obj2.addUsuario(usr2);
        System.out.println( "\t Total: " +obj1.getNumUsuarios() );
        obj1.addUsuario(usr3);
        System.out.println( "\t Total: " +EjemploMetodosDeClaseMain.NUM_USUARIOS );
        obj2.addUsuario(usr4);
        System.out.println( "\t Total: " +getNumUsuarios() +"\n");

        obj2.delUsuario(usr4);
        System.out.println( "\t Total: " +EjemploMetodosDeClaseMain.getNumUsuarios() );
        obj1.delUsuario(usr3);
        System.out.println( "\t Total: " +obj1.getNumUsuarios() );
        obj2.delUsuario(usr2);
        System.out.println( "\t Total: " +EjemploMetodosDeClaseMain.NUM_USUARIOS );
        obj1.delUsuario(usr1);
        System.out.println( "\t Total: " +getNumUsuarios() +"\n");
    }
}
