### Filtro SpringBoot - Health System



**Descripción**

Este proyecto se encarga del modelado de la base de datos de un sistema de salud, y de gestionar distintas peticiones hechas a los siguientes endpoint relacionados con la entidad Customer. Se está trabajando en la construcción del manejo de peticiones a otros puntos clave del sistema.

##### Tecnologías implementadas

SpringBoot Framework

MySQL databa magament



##### Endpoints/peticiones

get: localhost:8080/health/customer

get: localhost:8080/health/customer/123

post: localhost:8080/health/customer

put: localhost:8080/health/customer/123

delete: localhost:8080/health/customer/123



**Formato Json de ejemplo para solicitar post,put,delete**

post: 

{
	"customer":
		{
		"id": "666",
	"name": "Mario",
	"lastname": "Lopez",
	"email": "xd@gmail.com",
	"birthdate": "2005-08-10",
	"lon": 50.0,
	"lat": 50.0
	},
	"cityCode":"LIA"
}



update: {
	"customer":
		{
		"id": "123",
	"name": "Mario",
	"lastname": "Lopez",
	"email": "xd@gmail.com",
	"birthdate": "2005-08-10",
	"lon": 50.0,
	"lat": 50.0
	},
	"cityCode":"LIA"
}

delete:

{
	"id": "1234",
	"name": "Jairo",
	"lastname": "Lopez",
	"email": "xd@gmail.com",
	"birthdate": "2005-08-10",
	"lon": 50.0,
	"lat": 50.0
}

