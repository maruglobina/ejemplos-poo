package com.clases;

public class EjemploConstructoresMain {
    public static void main(String args[])
    {
        Usuario usr1, usr2;     /* Se declaran dos objetos de la clase Usuario */
        boolean si_no;

        usr1 = new Usuario();       /* Se utiliza el constructor por omisión */
        si_no = usr1 instanceof Usuario;

        if(si_no == true)
            System.out.println("\nEl objeto usr1 SI es instancia de Usuario.");
        else
            System.out.println("\nEl objeto usr1 NO es instancia de Usuario.");

        usr2 = usr1;		/* usr1 y usr2 son el mismo objeto */
        si_no = usr2 instanceof Usuario;

        if(si_no == true)
            System.out.println("\nEl objeto usr2 SI es instancia de Usuario.");
        else
            System.out.println("\nEl objeto usr2 NO es instancia de Usuario.");
    }
}
