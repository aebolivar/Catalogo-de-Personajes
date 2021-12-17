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

<p align="center"> <img src="https://github.com/aebolivar/Aplicacion_principios_SOLID/blob/master/Imagenes%20README/SOLID.png"> </p> 

El desarrollo de este ejercicio tiene como objetivo la aplicación de los principios SOLID (minimo 3), y se encuentra dividido en dos partes, la primera parte que es su diseño y la segunda, que comprende la implementación. De acuerdo a lo anterior, se mostrara en su primera parte la estructura de este desarrollo por medio de su Diagrama de Clases y se ubicara de manera clara donde estan aplicados estos principios. 

### Ubicación de cada principio📌
---
Se explica donde y como esta aplicado cada uno de los principios SOLID, y se ilustra con el diagrama de clases enfocando la parte en donde se evidencia.

#### Patron Singleton
---
En este caso este principio se enfoco en la clase Musico y se analizo como esta tenía metodos que no iba a implementar en todos los casos, y contrario a solucionarlo con un metodo vacío o una expeción, se debe tener como guia este principio que nos habla acerca de que las clases no deben depender de interfaces que no se vayan a utilizar, para este caso se tomo la interfaz que tenia dos metodos y se dividio en dos interfaces, esto permite que las interfaces se usen por completo, esto se hizo de esta forma para visualizar ell principio a pequeña escala pero ya en una situación más compleja la solución no es tan sencilla y se puede solucionar con un patron de diseño.

![Diagrama de clases: PRU](https://github.com/aebolivar/Aplicacion_principios_SOLID/blob/master/Diagrama%20de%20Clases/PrincipioSegregacionInterfaces.png)

#### Patron Method Factory
---
Este principio es el que se refiere a que una clase debe cambiar por una unica razón, para ubicar este principio se debe en primer lugar identificar las responsabilidades que tiene cada clase y pensar en que al momento de la extensión o cambios que se requieran se consiga afectar al menor numero de partes posibles de la aplicación.

En este caso especifico este principio se aplico en la separación entre las clases de cada instrumento y la representación de estos, la clase conserva sus metodos, y la interfaz incluso se puede extende para terminal o navegador para ver la representación del instrumento, para así mostrar como si cambia alguna de las dos clases no va a afectar a la otra, se abran logrado desacoplar.

![Diagrama de clases: PRU](https://github.com/aebolivar/Aplicacion_principios_SOLID/blob/master/Diagrama%20de%20Clases/PrincipioResponsabilidadUnica.png)

#### Patron Prototype
---
Este es el principio que trata sobre como las clases deben estar abiertas a extensiones y cerradas a modificaciones, esto quiere decir, que si requiero agregar una nueva funcionalidad no puedo modificar el codigo pero si lo puedo extender.

En este caso el principio se ubica en la clase Instrumento, cada vez que tenga que agregar otro nuevo tipo de instrumentos, se debe modificar el código y es allí donde aplicamos el principio Open/Closed exactamente cuando yo desee agregar otra funcionalidad, en este caso, otro tipo de instrumentos, no tengo que modificar la clase de Instrumento, porque esta se penso como una clase abstracta que tiene los metodos de tocar y afinar que se utilizan para todos los tipos de instrumentos sin que se tenga que tocar la clase Instrumento posteriormente.

![Diagrama de clases: PRU](https://github.com/aebolivar/Aplicacion_principios_SOLID/blob/master/Diagrama%20de%20Clases/PrincipioOpen_Closed.png)

#### Principio de Sustitución de Liskov
---
Este principio se basa en asegurarnos de que cuando extendemos una clase, no estamos alterando el comportamiento de la clase principal, en lo práctico el principio expone como si se tiene una clase base que tiene una clase derivada y esta última se sustituye y el programa sigue funcionando, entonces la clase derivada es una subtipo de la clase base, y se cumple con lo que se enuncia inicialmente.

![Diagrama de clases: PRU](https://github.com/aebolivar/Aplicacion_principios_SOLID/blob/master/Diagrama%20de%20Clases/PrincipioSustitucionLiskov.png)

### Información Adicional⚙️
---
Primera parte: Diseño, que se encuentra en el presente README
Segunda parte: Implementación, que se encuentra en la carpeta "orquesta_final"
