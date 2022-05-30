public class Gato {

    private String _nombre;
    private Double _peso;

    public Gato (nombre, peso){
        this._nombre = nombre;
        this._peso = peso;
    }

    public String maullar(String otroGatito){
        return s"Soy ${_nombre} y le estoy ladrando a ${otroGatito}";
    }
}