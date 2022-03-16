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
    
    + Ahora crearemos el tag "v2.0.0", primero usamos el comando `"git log --oneline"` cogeremos el código del nuevo commit y pondremos `"git tag -a v2.0.0 -m "Nombre" código"`

- Luego hemos creado la rama "develop", y luego desde la rama "master" hemos hecho un 
