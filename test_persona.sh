

curl -X PUT -H "Content-Type:application/json" -d '{"dni":"49231278F","nombre":"Mouctar","apellido":"Diallo","email":"mahout@gmail.com","fecha_nacimiento":"01-01-2005"}' 'http://localhost:8080/crear_persona/1'

curl -X PUT -H "Content-Type:application/json" -d '{"dni":"49231278F","nombre":"David","apellido":"Menphis","email":"menphis@gmail.com","fecha_nacimiento":"01-01-2010"}' 'http://localhost:8080/crear_persona/2'

curl -X PUT -H "Content-Type:application/json" -d '{"dni":"49231278F","nombre":"Enric","apellido":"Om","email":"stopcodiing@gmail.com","fecha_nacimiento":"01-01-1969"}' 'http://localhost:8080/crear_persona/3'



curl -X GET 'http://localhost:8080/crear_persona/2'


curl -X PATCH -H "Content-Type:application/json" -d '{"apellido":"Feijoo"}' 'http://localhost:8080/crear_persona/2'


curl -X GET 'http://localhost:8080/crear_persona/2'

curl -X DELETE 'http://localhost:8080/crear_persona/2'

curl -X GET 'http://localhost:8080/crear_persona/2'
