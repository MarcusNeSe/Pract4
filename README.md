# Practica 4

- Creando copia practica 3, nueva rama "master", tag y subiendolo todo:

    + Para hacer esto hemos tenido que usar primero un `"git init"` (desde git, estando dentro de la carpeta en la cual están todos los archivos .java). Luego hemos hecho un `"git add ."`, para mover todos los archivos al área de ensayo, una vez metido todo, hemos usado el comando `"git commit -m "First version"`. 

    + Un vez hecho, crearemos la rama master con `"git branch master"`, luego nos posicionaremos en esa rama con `"git checkout master"` y luego subiremos el primer commit a GitHub con `"git remote add origin URLdeTuProyectoEnGithub"` y seguido de un `"git push origin master"`. 

    + Ahora crearemos el tag "v1.0.0" y lo pondremos todo dentro.

    + Para esto deberemos de saber primero el código del commit pondremos `"git log --oneline` y ahora como sabremos el código del commit usaremos `"git tag -a v1.0.0 -m "Versión completa" código (ej: e6D9924)"`.

    + El tag "v1.0.0" está creado y dentro de el estará todo el código. Ahora hay que subirlo con el comando `"git push origin v1.0.0"`.

- Borrando interfaz e implementación en las clases, creando "v2.0.0":
 
    + Primero cambiaremos el código quitando la interfaz y la implementación en cada clase.
    
    + Una vez quitado haremos un nuevo commit con `"git add ."`, luego `"git commit -m "Descripción que queramos"` y lo subiremos `"git push origin master"`.
    
    + Ahora crearemos el tag "v2.0.0", primero usamos el comando `"git log --oneline"` cogeremos el código del nuevo commit y pondremos `"git tag -a v2.0.0 -m "Nombre" código"`.

    + Una vez creado lo subiremos con `"git push origin v2.0.0"`.

- Creando nueva rama "develop" y fusionamos:
    
    + Para crear la nueva rama usaremos `"git branch develop"`.

    + Ahora como estaremos desde la rama master haremos una fusion usando el comando `"git merge develop"`.
    
    + Hay que subir la rama a git con `"git push origin develop"`.

- Moviendonos a la rama develop, creamos v2.1.0 y subimos.

    + Nos moveremos a la rama develo con `"git checkout develop"`.
    
    + Una vez estando en la rama "develop", crearemos la nueva interfaz, la hemos llamado "NuevaInterfaz.java".
