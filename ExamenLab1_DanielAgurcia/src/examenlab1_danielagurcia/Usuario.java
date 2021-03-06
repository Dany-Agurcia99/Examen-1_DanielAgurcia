package examenlab1_danielagurcia;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {

    String nombre;
    String username;
    String password;
    Date fecha_nacimiento;
    int numero_telefonico;
    String correo_electronico;
    String genero_fav;
    ArrayList<Libro> libros_usuario = new ArrayList();
    ArrayList<Usuario> lista_amigos = new ArrayList();
    ArrayList<Usuario> lista_solicitudes = new ArrayList();

    public Usuario() {
    }

    public Usuario(String nombre, String username, String password, Date fecha_nacimiento, int numero_telefonico, String correo_electronico, String genero_fav) {
        this.nombre = nombre;
        this.username = username;
        this.password = password;
        this.fecha_nacimiento = fecha_nacimiento;
        this.numero_telefonico = numero_telefonico;
        this.correo_electronico = correo_electronico;
        this.genero_fav = genero_fav;
    }

    public ArrayList<Usuario> getLista_solicitudes() {
        return lista_solicitudes;
    }

    public void setLista_solicitudes(ArrayList<Usuario> lista_solicitudes) {
        this.lista_solicitudes = lista_solicitudes;
    }
    
    public ArrayList<Usuario> getLista_amigos() {
        return lista_amigos;
    }

    public void setLista_amigos(ArrayList<Usuario> lista_amigos) {
        this.lista_amigos = lista_amigos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getNumero_telefonico() {
        return numero_telefonico;
    }

    public void setNumero_telefonico(int numero_telefonico) {
        this.numero_telefonico = numero_telefonico;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getGenero_fav() {
        return genero_fav;
    }

    public void setGenero_fav(String genero_fav) {
        this.genero_fav = genero_fav;
    }

    public ArrayList<Libro> getLibros_usuario() {
        return libros_usuario;
    }

    public void setLibros_genero_fav(ArrayList<Libro> libros_usuario) {
        this.libros_usuario = libros_usuario;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
