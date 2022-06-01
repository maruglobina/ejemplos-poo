## Ejemplos de POO
intro...
### Ejercicio 1: Clases

1) Escribir una clase Punto que complete la de esta entrada, para que además de los constructores y de los métodos getX() 
y getY(), y distancia(), contenga también los siguientes métodos:

Dos métodos para modificar los valores atributos.
Un método toString() que devuelva la información del Punto de la siguiente manera (x, y).
Una pequeña ayuda: El método toString() concatena los paréntesis y comas 
como literales con los valores de los atributos, en el orden requerido.

````
 y
 ^
4|              *(8,4)
3|          *(6,3)
2|   *(2,2)
1|   *(2,1)
 |------------------------> x
 0 1 2 3 4 5 6 7 8 9 10 11
 ```` 


     
2) Armar un método que dado un array de puntos, encontrar los puntos más próximos entre si.


### Ejercicio 2: Clases

Utilizando la clase Punto del ejercicio anterior, escribe una clase Polígono. Esta clase tiene como atributo un array de objetos Punto. Se consideran adyacentes los objetos Punto que estén en celdas consecutivas del array y los puntos que están en la primera y última celda. Esta clase ha de tener los siguientes métodos:

el constructor, que recibirá por parámetro un array con los objetos Punto que definen el Polígono.
trasladar(), recibe por parámetro el desplazamiento en la coordenada x y el desplazamiento en la coordenada y.
escalar(), recibe por parámetro el factor de escala para la coordenada x y el factor de escala para la coordenada y.
numVértices(), devuelve el número de vértices del Polígono.
perímetro(), devuelve el perímetro del Polígono.
Algunos consejos:

En el constructor hay que controlar que el número de vértices del Polígono no es menor que 3. En caso contrario, se lanza una excepción.
Para trasladar el Polígono, se recorre el array desplazando cada uno de los puntos.
Para escalar, se hace lo mismo, pero multiplicando su coordenada x por el factor x y su coordenda y por el factor y.
El perímetro se calcula utilizando el método distancia() de la clase Punto. Se calcula y se suma la distancia de cada Punto con su Punto siguiente, sin olvidarse de la distancia entre el Punto de la celda 0 y de la última celda.