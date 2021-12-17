# Catalogo de Personajes - Aplicación de Patrones Creacionales

### Integrantes✒️
---
Angie Alina Estefania Peña Bolivar - 20181020146

### Descripción del Proyecto✒️
---
<p align="center"> <img src="https://github.com/aebolivar/Catalogo-de-Personajes/blob/master/imagenesREADME/TituloJuego.png"> </p> 
<p align="center"> <img src="https://github.com/aebolivar/Catalogo-de-Personajes/blob/master/imagenesREADME/El%20se%C3%B1or%20de%20los%20Anillos.jpg" align="center" height="450" width="450" > </p> 

En este programa se muestra un Catalogo de Personajes que toma como base para su creación el Señor de los Anillos para crear los siguientes personajes: Humano, Enano, Elfo, Istiri, Hobbit. El aplicativo permite al usuario seleccionar la cantidad de personajes que desea de cada tipo (por ejemplo: 5 humanos, 2 enanos, 9 elfos, ningún hobbit, 6 Istiri) y luego de confirmar se despliega una vista que consta del panel izquierdo y el panel derecho, en el de la parte izquierda se podrá observar la "tarjeta" del personaje que tiene una vista de este seguido de una descripción, los atributos de agilidad, altura, energia, fuerza y salud con sus respectivos valores para cada personaje y el arma, en la parte derecha se mostrara la cantidad de personajes seleccionados de cada tipo.

### DISEÑO: Diagrama de Clases📋
--- 	
![Diagrama de clases: PRU](https://github.com/aebolivar/Aplicacion_principios_SOLID/blob/master/Diagrama%20de%20Clases/Diagrama%20de%20Clases.png)

### Aplicando los Patrones Creacionales 🔧
---
El desarrollo de este ejercicio tiene como objetivo la aplicación de los principios SOLID (minimo 3), y se encuentra dividido en dos partes, la primera parte que es su diseño y la segunda, que comprende la implementación. De acuerdo a lo anterior, se mostrara en su primera parte la estructura de este desarrollo por medio de su Diagrama de Clases y se ubicara de manera clara donde estan aplicados estos principios. 

### Ubicación de cada principio📌
---
Se explica donde y como esta aplicado cada uno de los principios SOLID, y se ilustra con el diagrama de clases enfocando la parte en donde se evidencia.

#### Patron Method Factory
---
"Define una interfaz para crear un objeto, pero deja que sean las subclases quienes decidan qué clase instanciar. Permite que una clase delegue en sus subclases la creación de objetos." Tomado de: <a href="https://github.com/apdaza/patrones-gof-python">Patrones GOF Python - Profesor Alejandro Daza</a>

#### Patron Prototype
---
"Especifica los tipos de objetos a crear por medio de una instancia prototípica, y crear nuevos objetos copiando este prototipo." Tomado de: <a href="https://github.com/apdaza/patrones-gof-python">Patrones GOF Python - Profesor Alejandro Daza</a>

#### Patron Singleton
---
"Garantiza que una clase sólo tenga una instancia, y proporciona un punto de acceso global a ella." Tomado de: <a href="https://github.com/apdaza/patrones-gof-python">Patrones GOF Python - Profesor Alejandro Daza</a>

# Aplicación de los principios SOLID

#### Principio de Sustitución de Liskov
---
Este principio se basa en asegurarnos de que cuando extendemos una clase, no estamos alterando el comportamiento de la clase principal, en lo práctico el principio expone como si se tiene una clase base que tiene una clase derivada y esta última se sustituye y el programa sigue funcionando, entonces la clase derivada es una subtipo de la clase base, y se cumple con lo que se enuncia inicialmente.

### Información Adicional⚙️
---
Primera parte: Diseño, que se encuentra en el presente README
Segunda parte: Implementación, que se encuentra en la carpeta "orquesta_final"
