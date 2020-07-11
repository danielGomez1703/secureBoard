# Tablero MultiUser - Websocket security
 
Esta aplicacion es un tablero multiusuarios, donde  lo que se haga dentro de el 
tablero se pueda ver desde cualquier otra session, esto para hacer una dinamica como en un Aula de clase

esta aplicacion funciona mediante la creacion de puntos que se concatenan al hacer click y desplazar el mouse.

se adiciono la funcionalidad del trabajo previo realizado en clase ARSW en la cual se propuso realizar las solicitudes por webSocket
y la seguridad en WS con tickets y Redis

## requsites
    -java version 1.7+
    -maven installed

## Installation
 ```sh
$ git clone https://github.com/danielGomez1703/secureBoard
$ cd ARSW-Lab7
$ mvn package
$ mvn spring-boot:run
```


# MANUAL
  una vez instalado y ejecutado el programa debera acceder a su navegador e introdocir localhost y el puerto tomcat determinado 8080 de la siegueinte forma:
  navegador  
	http://localhost:8080/bb2.html
  

  puede acceder a la aplicacion por el siguiente link:
[link Despliegue Heroku Del Tablero Dinamico](https://floating-citadel-07870.herokuapp.com/bb2.html)

# PRUEBAS

Las siguientes imagenes son las evidencias de la aplicacion de un Tablero Dinamico.
- reinicio
- MultiUsuario
- cadenas invalidas
- Validacion de usuario
- control de session por redis


Se requiere una validacion de usuario para poder acceder a la aplicacion
    credenciales: usuario,usuario2
    password: password,password2

![Modelo](https://github.com/danielGomez1703/secureBoard/blob/master/resources/con1.PNG)

aca podemos observar como realiza la conexion 

![Modelo](https://github.com/danielGomez1703/secureBoard/blob/master/resources/con1-2.PNG)

se puede observar como esta funcionando el inicio de sesion
![Modelo](https://github.com/danielGomez1703/secureBoard/blob/master/resources/con2.PNG)

si cerramos la sesion por accidente o por un bajon, el servicio redis nos provee las sesiones ya iniciadas y no requiere un nuevo inicio de sesion
![Modelo](https://github.com/danielGomez1703/secureBoard/blob/master/resources/con3.PNG)

Al iniciar podemos ver los tableros en blanco , lo que haga en un cliente debe aparecer en otro. 

![Modelo](https://github.com/danielGomez1703/secureBoard/blob/master/resources/evidence1.PNG)	

En la siguiente imagen s epuede ver como el punto que se crea en un lado del tablero, cambia asi mismo en el otro cliente.

![Modelo](https://github.com/danielGomez1703/secureBoard/blob/master/resources/evidence2.PNG)

se puede ver que el proyecto se cre de forma correcta.


![Modelo](https://github.com/danielGomez1703/secureBoard/blob/master/resources/Build.PNG)



## Modelo
![Modelo2](https://github.com/danielGomez1703/secureBoard/blob/master/resources/model.PNG)


El modelo consiste en una comuniacion por webSockets, donde se envian mensajes de formas constantes con la informacion requerida
en este caso son puntos o cordenadas a pintar dentro del tablero.

podemos ver en la consola como envian los puntos. 

![Modelo](https://github.com/danielGomez1703/secureBoard/blob/master/resources/evidence2.PNG)
    

## Descripion


La aplciacion consiste en un canvas que se crea para que los usuarios puedan escribir dentro del tablero con el fin de hacer clases mas amenas

la trasa son ciruculos concatenados por donde pasa el mouse, es decir sigue la trasa del mouse con circulos y los pinta y guarda en una entidad.


![ev2](https://github.com/danielGomez1703/secureBoard/blob/master/resources/evidence1.PNG)

## DOCUMENTACION

la documentacion se encuentra adjunta en el repositorio 
[aqui encontrara la documentacion](https://github.com/danielGomez1703/secureBoard/tree/master/site/apidocs)


## AUHTOR

Daniel Felipe Gomez Suarez - [danielgomez1703](https://github.com/danielGomez1703)
    
## BUILT IN
Proyecto construido en [Maven](https://maven.apache.org/)
Proyecto construido en [Redis Lab](https://redislabs.com/)
## License
----
para consultar su licencia vaya al link 
[leer aqui](https://github.com/danielGomez1703/ARSW-Lab7/blob/master/LICENSE.txt)
