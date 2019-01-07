package Paquete;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import sun.util.calendar.LocalGregorianCalendar;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "inscripciones")
public class Inscripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


        /*
    private Long id_persona;



    public Long getId_persona() {
        return id_persona;
    }
    public void setId_persona(Long id_persona) {
        this.id_persona = id_persona;
    }
    */
    /*
    private Long id_videojuego;
    public Long getId_videojuegos() {
        return id_videojuego;
    }
    public void setId_videojuegos(Long id_videojuegos) {
        this.id_videojuego = id_videojuego;
    }
*/
    private String fecha_inscripcion;
    public String getFecha_inscripcion() {
        return fecha_inscripcion;
    }
    public void setFecha_inscripcion(String fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }

    //Implementación many to one


    /*@ManyToOne(fetch = FetchType.LAZY, optional=false)
        @JoinColumn(name="personaAsociada",nullable=false)
        @OnDelete(action= OnDeleteAction.CASCADE)
        @JsonIgnore

    */
    @ManyToOne
    private Persona persona;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @ManyToOne
    private Videojuego videojuego;

    public Videojuego getVideojuego() {
        return videojuego;
    }

    public void setVideojuego(Videojuego videojuego) {
        this.videojuego = videojuego;
    }

    @Override
    public String toString() {
        return "Inscripcion{" +
              //  "Id_persona=" + id_persona +
                 "Id_persona=" + persona.getId()+
                ", Id_videojuego='" + videojuego.getId() + '\'' +
                ", fecha_inscripcion='" + fecha_inscripcion + '\'' +
                '}';
    }

}
