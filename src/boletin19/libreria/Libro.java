package boletin19.libreria;

public class Libro implements Comparable{
    
    private String titulo;
    private String autor;
    private String ISBN;
    private float precio;
    private int numUnidades;

    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, float precio, int numUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
        this.numUnidades = numUnidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public float getPrecio() {
        return precio;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setNumUnidades(int numUnidades) {
        this.numUnidades = numUnidades;
    }

    @Override
    public String toString() {
        return "Titulo: "+ titulo + "\nAutor: " + autor + "\nISBN: " + ISBN + "\nPrecio: " + precio + "\nNumero de Unidades: " + numUnidades+"\n";
    }
    
    //Esta funcion establece un criterio de comparacion para poder ordenar los objetos
    @Override
    public int compareTo(Object o) {
        Libro per = (Libro)o;  //Paso de un elemento global a un elemento Persoa
        if(titulo.compareToIgnoreCase(per.getTitulo())>0){
            return 1;
        }else if(titulo.compareToIgnoreCase(per.getTitulo())==0){
            return 0;
        }else{
            return -1;
        }
    }
}
