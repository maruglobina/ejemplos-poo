public class Perro {

    private String _nombre;
    private Double _peso;

    public Perro (){

    }

    public String ladrar(String otroPerrito){
        return s"Soy ${_nombre} y le estoy ladrando a ${otroPerrito}";
    }
}