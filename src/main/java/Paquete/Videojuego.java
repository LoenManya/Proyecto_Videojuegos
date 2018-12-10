package Paquete;

import sun.util.calendar.LocalGregorianCalendar;

import javax.persistence.*;

@Entity

public class Videojuego {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String Identificador;
    public String getIdentificador() {
        return Identificador;
    }
    public void setIdentificador(String identificador) {
        this.Identificador = identificador;
    }

    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String compania;
    public String getCompania() {
        return compania;
    }
    public void setCompania(String compania) {
        this.compania = compania;
    }

    private String genero;
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }


    private String fecha_lanzamiento;
    public String getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }
    public void setFecha_lanzamiento(String fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }


    @Override
    public String toString() {
        return "Videojuego{" +
                "Identificador=" + Identificador +
                ", nombre='" + nombre + '\'' +
                ", compañia='" + compania + '\'' +
                ", genero='" + genero + '\'' +
                ", fecha_lanzamiento='" + fecha_lanzamiento + '\'' +
                '}';
    }

}
