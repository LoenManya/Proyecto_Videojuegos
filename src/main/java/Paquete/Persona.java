package Paquete;

import sun.util.calendar.LocalGregorianCalendar;

import javax.persistence.*;

@Entity

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String Dni;
    public String getDni() {
        return Dni;
    }
    public void setDni(String dni) {
        this.Dni = dni;
    }

    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String apellido;
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    private String email;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    private String fecha_nacimiento;
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "Dni=" + Dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", fecha_nacimiento='" + fecha_nacimiento + '\'' +
                '}';
    }

}
