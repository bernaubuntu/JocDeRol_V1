# JocDeRol_V1
Juego para la practica de DAM

## Contenido
En esta práctica se realizará en 7 fases.

### Fase 1. Herencia. :+1:
Se crean las siguentes clases:
- Player. Clase abstracta genérica.
- Alien. Clase con especialización de Player.
- Human. Clase con especialización de Player.
- Warrior. Clase con especialización de Human.

### Fase 2. Dando cuerpo a los jugadores. :+1:
Añadir a la clase Player lo siguiente:
- 4 atributos: *name, attackPoints, defensePoints, life*
- Modificar el metodo *toString()*
- Añadir el método void *attack(Player p)*.
- Añadir el método protected void *hit(int attackPoints)*.

Crear la clase principal **JocDeRol** con el metodo *pruebaFase()*.

### Fase 3. Sobrecarga y Poliformismo.
Codificar las clases *Human*, *Alien* y *Warrior*, sobreescribiendo los métodos necesarios.
Adaptar la función *pruebaFase()* para comprobar el funcionamiento.

### Fase 4. Relaciones entre clases.
Crear la clase *Team*
- Añadir el atributo *name*.
- Crear el constructor pasandole el nombre del equipo.
- Añadir el atributo privado del tipo *ArrayList*, llamado *Players*
- Modificar el método *toString()*
- Añadir el método *equals*.

Modifica la clase *Player*:
- Añadir atributo *teams* del tipo *ArrayList*
- Modificar el método *toString()*
- Añadir el método *equals*

### Fase 5. Más relaciones.

### Fase 6. Configuración del programa principal y Excepciones.

