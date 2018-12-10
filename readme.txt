Resumen de las operaciones que realizará el proyecto:

    Alta persona:
    
        Vamos a crear una operacion donde pediremos por pantalla los siguientes atributos y nos retornara un texto con el nombre i apellidos de la persona creada. 
    
        Alta_persona(int DNI, String Nombre, String Apellidos, Date Fecha Nacimiento, String Email)
    
            return printf(Usuario Nombre Apellidos creado correctamente) 
    
    Modificar persona: 
    
        Vamos a modificar uno de los campos de la tabla persona indicando el DNI como primary key y el campo a modificar. Esto nos retornara una un texto indicando el campo modificado
        y el DNI de la persona.
    
        Modificar_persona (int DNI, campo a modificar)
            return (Modificado el campo ........ del usuario DNI)
    
    Eliminar persona: 
    
        En este apartado indicaremos el DNI de la persona que queramos eliminar. Actoseguido este registro será eliminado y saldra por pantalla un mensaje indicando la eliminación.
    
        Eliminar_persona(int DNI)
                return(Se ha eliminado la persona)
    
    Alta Inscripcion 
    
        Con el campo de alta inscripcion pediremos el DNI i el Codigo del videojuego que son las primary keys de cada tabla para hacer una relacion i crear una nueva tabla. 	
    
        Alta_inscripcion( int DNI, int Codigo_videojuegos, date fecha inscripcion) 
            return(Felicidades usted está inscrito a este videojugos) 
    
    Eliminar Inscripcion
        
        En este apartado eliminaremos una inscripcion realizada previamente, introduciendo las dos primary keys y la fecha de inscripción. Esto devolvera un mensaje que indicara que la 
        inscripcion ha sido cancelada, junto con la fecha de inscripcion. 	
    
        Eliminar_inscripcion(int DNI, int Codigo_videojuego, date fecha inscripcion)
            return(La inscripción se ha cancelado a fecha_inscripcion )
    
    Consultar Inscripcion 
    
        Por último podremos consultar la fecha de nuestra inscripción introduciendo el DNI i el codigo_videojuego, esto nos retornara la fecha de nuestra inscripcion. 	
    
        Consultar_inscripcion ( int DNI, Int codigo_vidiejugos)
            return(Fecha_inscripcion) 