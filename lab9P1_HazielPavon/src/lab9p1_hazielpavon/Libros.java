package lab9p1_hazielpavon;

public class Libros {

    private String titulo;
    private String escritor;
    private String genero;
    private int edad;

    public Libros(String escritorN, String tituloN, String generoN, int edadN) {
        this.titulo = tituloN;
        this.escritor = escritorN;
        this.genero = generoN;
        this.edad = edadN;

    }

    public Libros() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tituloN) {
        this.titulo = tituloN;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritorN) {
        this.escritor = escritorN;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String generoN) {
        this.genero = generoN;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edadN) {
        this.edad = edadN;
    }

  
   
    public String toString() {
        return "\n Titulo: " + titulo + "\n Autor: " + escritor + "\n Genero :" + genero + "\n edad: " + edad;
    }

   

}
