package com.sobrecarga;

public class EjemploSobrecargaMain {
    void imprimeUsuario(Usuario4 usr)
    {
        //   usr.nombre equivale en este caso a usr.getNombre()
        System.out.println("\nNombre: " + usr.nombre );
        System.out.println("Edad: " + usr.getEdad() );
        System.out.println("Direccion: " + usr.getDireccion() +"\n");
    }

    public static void main(String args[])
    {
        EjemploSobrecargaMain prog = new EjemploSobrecargaMain( );
        /* Se declaran dos objetos de la clase Usuario4 */
        Usuario4 usr1,usr2;

        /* Se utiliza el constructor por omisión */
        usr1 = new Usuario4( );
        prog.imprimeUsuario(usr1);

        /* Se utiliza el segundo constructor de Usuario4 */
        usr2 = new Usuario4("Eduardo",24,"Mi direccion");
        prog.imprimeUsuario(usr2);

        /* Se utiliza el tercer constructor de Usuario4 */
        usr1 = new Usuario4(usr2);

        usr1.setEdad(50);
        usr2.setEdad(30.45f);

        prog.imprimeUsuario(usr1);
        prog.imprimeUsuario(usr2);
    }
}
