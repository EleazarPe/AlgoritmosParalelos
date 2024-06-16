# AlgoritmosParalelos

Por: Carlos Peterson y Miguel Noboa


# Parte 1: Ejercicio de Ley de Amdal

Unidad de tiempo: 120

Porciento paralelizable: 85%

![image](https://github.com/EleazarPe/AlgoritmosParalelos/assets/132306836/d1ca287c-69fe-404d-800d-68aa36c1c4ca)


# Parte 2: Programar Suma Paralela

Esta es la parte con documentacion importante. 

Lo primero, que hay que hacer?

Tenemos que implementar un algoritmo que nos deje sumar un arreglo de numeros en paralelo. 

Para esto creamos la clase SumaHilos la cual implementa Runnable. Aqui ponemos la parte serial del programa la cual solo suma todos los numeros del arreglo que recibe.

En el main dividimos los arreglos a cada suma hilos y ponemos cada suma en un Thread. Corremos los hilos, esperamos a que terminen llamando join() y sumamos los resultados.

Estos fueron los resultados de las corridas.

![image](https://github.com/EleazarPe/AlgoritmosParalelos/assets/132306836/872829d3-c798-4210-a361-e6d370578cd4)

Los resultados dependeran de la cantida de numeros en el arreglo. En nuestro caso tenemos 1,000,000 de numeros en el documento testCase el cual usamos para obtener los datos para cada corrida.

Como podemos ver el mejor tiempo se encuentra con 4 hilos.

Esto no sera igual para cada computadora, esto solo significa que utilizando la computadora de Miguel el costo de separacion y la suma total, tomando en cuenta la cantidad de numeros, salio menos costoso usando 4 hilos.

Otro detalle es que la cantidad de tiempo incrementa grandemente en 32 y 64. la razon que tiene mas sentido es que a la cantidad de numeros seran relativamente pequeñas, no vale mucho la pena el costo de division y la suma final. Tambien es bueno decir que el numero total de hilos fisicos de esta computadora solo llegan a 12  (6 cores, 12 threads).


## Como correr el programa

Para correr utilizamos la terminal de intellij. Usamos java 21. No tiene ningun argumento

La corrida real tendra una salida parecida a esta. Los resultados fueron puestos en una tabla para mejor visualizacion.

![image](https://github.com/EleazarPe/AlgoritmosParalelos/assets/132306836/026c5aca-7ec2-4203-82a3-e147acd624a2)
