#Script con los comandos que hemos usado en el terminator para realizar las pruebas, no está diseñado para ejecutarse en orden todo seguido 

#Crear persona
curl -X POST -H "Content-Type:application/json" -d '{"dni":"49231278F","nombre":"Enric","apellido":"Om","email":"stopcodiing@gmail.com","fecha_nacimiento":"01-01-1969"}' 'http://localhost:8080/users'

#Modificar persona
curl -X PUT -H "Content-Type:application/json" -d '{"apellido":"Nebot"}' 'http://localhost:8080/users/1'

#Ver persona
curl -X GET 'http://localhost:8080/users'

#Eliminar persona
curl -X DELETE -H "Content-Type:application/json" 'http://localhost:8080/users/1'


#Crear Videojuego
curl -X POST -H "Content-Type:application/json" -d '{"identificador":"454646H","nombre":"Rayman","compania":"Ubisoft","genero":"Aventura","fecha_lanzamiento":"01-11-2010"}' 'http://localhost:8080/games'

#Modificar Videojuego
curl -X PUT -H "Content-Type:application/json" -d '{"compania":"Noentiendo"}' 'http://localhost:8080/games/2'

#Mostrar Videojuegos
curl -X GET 'http://localhost:8080/games'

#Eliminar Videojuegos
curl -X DELETE -H "Content-Type:application/json" 'http://localhost:8080/games/2'

#Crear Inscripción
curl -X POST -H "Content-Type:application/json" -d '{"fecha_inscripcion":"04/01/2019"}' 'http://localhost:8080/inscripciones/2/1'

#Ver Inscripción
curl -X GET 'http://localhost:8080/inscripciones'
#Borrar Inscripción
curl -X DELETE -H "Content-Type:application/json" 'http://localhost:8080/inscripciones/3'
