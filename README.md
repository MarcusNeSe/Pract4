# Practica 4
___
- Creando copia practica 3, nueva rama "master", tag y subiendolo todo:
___
Para hacer esto hemos tenido que usar primero un `"git init"` (desde git, estando dentro de la carpeta en la cual están todos los archivos .java). Luego hemos hecho un           `"git add ."`, para mover todos los archivos al área de ensayo, una vez metido todo, hemos usado el comando `"git commit -m "First version"`. 

Un vez hecho, crearemos la rama master con `"git branch master"`, luego nos posicionaremos en esa rama con `"git checkout master"` y luego subiremos el primer commit a           GitHub con `"git remote add origin URLdeTuProyectoEnGithub"` y seguido de un `"git push origin master"`. 

Ahora crearemos el tag "v1.0.0" y lo pondremos todo dentro.

Para esto deberemos de saber primero el código del commit pondremos `"git log --oneline` y ahora como sabremos el código del commit usaremos `"git tag -a v1.0.0 -m               "Versión completa" código (ej: e6D9924)"`.

El tag "v1.0.0" está creado y dentro de el estará todo el código. Ahora hay que subirlo con el comando `"git push origin v1.0.0"`.
___
- Borrando interfaz e implementación en las clases, creando "v2.0.0":
___ 
Primero cambiaremos el código quitando la interfaz y la implementación en cada clase.
    
Una vez quitado haremos un nuevo commit con `"git add ."`, luego `"git commit -m "Descripción que queramos"` y lo subiremos `"git push origin master"`.
    
Ahora crearemos el tag "v2.0.0", primero usamos el comando `"git log --oneline"` cogeremos el código del nuevo commit y pondremos `"git tag -a v2.0.0 -m "Nombre" código"`.

Una vez creado lo subiremos con `"git push origin v2.0.0"`.
___
- Creando nueva rama "develop" y fusionamos:
___    
Para crear la nueva rama usaremos `"git branch develop"`.

Ahora como estaremos desde la rama master haremos una fusion usando el comando `"git merge develop"`.
    
Hay que subir la rama a git con `"git push origin develop"`.
___
- Moviendonos a la rama develop, creamos "v2.1.0" y subimos:
___
Nos moveremos a la rama develop con `"git checkout develop"`.
    
Una vez estando en la rama "develop", crearemos la nueva interfaz, la hemos llamado "NuevaInterfaz.java". Y crearemos el commit con primero `"git add ."`, luego un `"git         commit -m "Nueva Interfaz""` y lo subiremos con `"git push origin develop"`.
    
Esto lo meteremos el un tag "v2.1.0", para eso miraremos el código con `"git log --oneline"` y creaemos el tag y lo subiremos con `"git tag -a v2.1.0 -m "Nombre" código"`       y `"git push origin v2.1.0"`.
___
- Implementando la interfaz, creamos "v2.2.0":
___
Editamos las clases implementando la interfaz, ahora las subiremos con un nuevo commit para eso usamos los siguientes comando `"git add .`", `"git commit -m "Interfaz           Implementada""` y para subir `"git push origin develop"`.
    
Ahora crearemos el tag "v2.2.0" y lo subimos, primero hay que saber el código del commit con `"git log --oneline"`, luego para crear el tag usaremos `"git tag -a v2.2.0 -m       "Nombre" código"` y lo subiremos con `"git push origin v2.2.0"`.
___
- Subiendo la "v2.2.0" a la rama "master" como "v3.0.0":
___

___
- Crear rama "develop2" y creando "v3.1.0":
___
Lo primero que hacemos es desde la rama "master" usar el comando `"git branch develop2"`, así crearemos la rama "develop2".

Ahora haremos un `"git merge develop2"` así estarán fusionadas. Nos moveremos a la rama con `"git checkout develop2"`.

Editaremos las clases que tienen implementadas la interfaz sonido y mejoraremos el sonido que hace el barco, gato y perro.

Luego haremos un `"git add ."` seguido de un commit `"git commit -m "Cambio Sonido""` y lo subiremos con `"git push origin develop2"`.

Para crear el tag "v3.1.0", primero buscamos el código del último commit creado con `"git log --oneline"`, ahora crearemos el nuevo tag con `"git tag -a v3.1.0 -m "Nombre" código"` y lo subiremos con `"git push origin v3.1.0"`.
