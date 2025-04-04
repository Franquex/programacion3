package pojos;

public class Mes {
    private int numero;
    private String nombre;
    private int cantitdadDias;

    public Mes(String nombre, int numero, int cantitdadDias) {
        this.setNombre(nombre);
        this.setNumero(numero);
        this.setCantitdadDias(cantitdadDias);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantitdadDias() {
        return cantitdadDias;
    }

    public void setCantitdadDias(int cantitdadDias) {
        this.cantitdadDias = cantitdadDias;
    }
}
