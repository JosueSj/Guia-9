
package Guia_9.Cadena;


public class Cadena {
    private String frase;
    private int Longitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.Longitud = frase.length();
    }

    public int getLongitud() {
        return Longitud;
    }

    public void setLongitud(int Longitud) {
        this.Longitud = Longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    
}
