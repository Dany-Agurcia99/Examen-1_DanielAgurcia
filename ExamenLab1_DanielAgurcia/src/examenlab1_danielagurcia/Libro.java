package examenlab1_danielagurcia;

import java.util.Date;

public class Libro {

    String titulo;
    String descripcion;
    int puntaje;
    int copias_disponibles;
    String Genero;
    int valor;
    int edicion;
    String autor;
    Date anio_publicacion;

    public Libro() {
    }

    public Libro(String titulo, String descripcion, int puntaje, int copias_disponibles, String Genero, int valor, int edicion, String autor, Date anio_publicacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.puntaje = puntaje;
        this.copias_disponibles = copias_disponibles;
        this.Genero = Genero;
        this.valor = valor;
        this.edicion = edicion;
        this.autor = autor;
        this.anio_publicacion = anio_publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getCopias_disponibles() {
        return copias_disponibles;
    }

    public void setCopias_disponibles(int copias_disponibles) {
        this.copias_disponibles = copias_disponibles;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getAnio_publicacion() {
        return anio_publicacion;
    }

    public void setAnio_publicacion(Date anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    public String toString2() {
        return "Titulo: " + titulo + "\nDescripcion: " + descripcion + "\nPuntaje: " + puntaje + "\nCopias disponibles: " + copias_disponibles + "\nGenero: " + Genero + "\nValor: " + valor + "\nEdicion: " + edicion + "\nAutor: " + autor + "\nAno de publicacion: " + anio_publicacion;
    }

    @Override
    public String toString() {
        return titulo;
    }

}
