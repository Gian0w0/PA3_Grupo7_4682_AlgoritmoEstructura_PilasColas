
# Actividad 2 – Cola FIFO

**Responsable:** Claudio García Pérez  
**Curso:** Algoritmo y Estructura de Datos Basados en Inteligencia Artificial  
**Evaluación:** PA3

---

## 1. Explicación del principio FIFO

### 1.1. ¿Qué es una cola FIFO?

FIFO significa *First In, First Out* (Primero en entrar, primero en salir). Es una estructura de datos que permite almacenar elementos y atenderlos respetando el mismo orden en que fueron ingresados.

Esto significa que el primer elemento que ingresa a la cola será el primero en salir.

### 1.2. Aplicación al caso académico

En una unidad de servicios académicos, los estudiantes pueden registrar diferentes solicitudes, como constancias de estudios, matrículas o consultas académicas.

Estas solicitudes se almacenan en una cola y son atendidas según su orden de llegada. De esta manera, se garantiza una atención organizada y se evita que las solicitudes más antiguas sean desplazadas por las nuevas.

### 1.3. Características principales

- Sigue el principio FIFO.
- Los elementos ingresan por el final de la cola.
- Los elementos salen por el frente de la cola.
- Mantiene el orden de llegada.
- Permite organizar la atención de solicitudes.
- Evita que las solicitudes se atiendan de manera desordenada.

---

## 2. Representación gráfica de una cola FIFO

### 2.1. Ejemplo de una cola de solicitudes académicas

Supongamos que cuatro estudiantes registran sus solicitudes en el siguiente orden:

1. Ana registra una solicitud.
2. Luis registra una solicitud.
3. Pedro registra una solicitud.
4. María registra una solicitud.

La representación gráfica de la cola es la siguiente:

```text
              FRENTE                         FINAL
                |                              |
                v                              v
        +-------------+  +-------------+  +-------------+  +-------------+
        |    ANA      |->|    LUIS     |->|    PEDRO    |->|    MARIA    |
        +-------------+  +-------------+  +-------------+  +-------------+
          Primera en       Segunda en       Tercera en       Última en
            salir             salir            salir           entrar
```

### 2.2. Funcionamiento de la cola

- **Encolar (Enqueue):** permite agregar una nueva solicitud al final de la cola.
- **Desencolar (Dequeue):** permite retirar la solicitud que se encuentra al frente de la cola.
- **Frente (Front):** permite consultar la primera solicitud pendiente de atención.
- **Verificar si está vacía (IsEmpty):** permite comprobar si existen solicitudes pendientes.

### 2.3. Ejemplo de operaciones

Inicialmente se agregan cuatro solicitudes:

```text
Encolar(Ana)
Encolar(Luis)
Encolar(Pedro)
Encolar(Maria)
```

Estado de la cola:

```text
FRENTE -> [Ana] -> [Luis] -> [Pedro] -> [Maria] <- FINAL
```

Se atiende la primera solicitud:

```text
Desencolar()
```

Ana es atendida y retirada de la cola.

Nuevo estado:

```text
FRENTE -> [Luis] -> [Pedro] -> [Maria] <- FINAL
```

Se puede observar que Luis pasa a ser el primero en ser atendido, respetando el principio FIFO.

---

## 3. Algoritmos de la cola FIFO

Para implementar la cola utilizaremos un arreglo que almacenará las solicitudes académicas y dos posiciones principales: frente y final.

### 3.1. Inicialización de la cola

```text
Algoritmo InicializarCola

    Definir frente, final Como Entero
    Definir cola[100] Como Cadena

    frente <- 0
    final <- -1

FinAlgoritmo
```

### 3.2. Algoritmo para encolar (Enqueue)

Permite agregar una nueva solicitud al final de la cola.

```text
Algoritmo Enqueue(solicitud)

    Si final = 99 Entonces
        Escribir "Error: la cola esta llena"
    Sino
        final <- final + 1
        cola[final] <- solicitud
        Escribir "Solicitud agregada correctamente"
    FinSi

FinAlgoritmo
```

### 3.3. Algoritmo para desencolar (Dequeue)

Permite retirar y atender la primera solicitud que ingresó a la cola.

```text
Algoritmo Dequeue

    Si IsEmpty() Entonces
        Escribir "Error: la cola esta vacia"
    Sino
        solicitud <- cola[frente]
        frente <- frente + 1

        Escribir "Solicitud atendida: ", solicitud
    FinSi

FinAlgoritmo
```

### 3.4. Algoritmo para visualizar el frente (Front)

Permite consultar cuál es la siguiente solicitud que será atendida sin eliminarla de la cola.

```text
Algoritmo Front

    Si IsEmpty() Entonces
        Escribir "La cola esta vacia"
    Sino
        Escribir "Siguiente solicitud: ", cola[frente]
    FinSi

FinAlgoritmo
```

### 3.5. Algoritmo para verificar si está vacía (IsEmpty)

Permite comprobar si la cola contiene solicitudes pendientes.

```text
Algoritmo IsEmpty

    Si frente > final Entonces
        Retornar Verdadero
    Sino
        Retornar Falso
    FinSi

FinAlgoritmo
```

---

## 4. Justificación del uso de una cola FIFO

La estructura de datos Cola FIFO es la más adecuada para gestionar las solicitudes de una unidad de servicios académicos porque permite atender a los estudiantes respetando el orden en que registraron sus solicitudes.

Su utilización ofrece las siguientes ventajas:

- **Orden de atención:** garantiza que la primera solicitud registrada sea la primera en atenderse.
- **Organización:** permite mantener un control ordenado de las solicitudes pendientes.
- **Equidad:** evita que las solicitudes más recientes pasen por delante de las anteriores.
- **Facilidad de gestión:** permite agregar nuevas solicitudes y atender las existentes mediante operaciones sencillas.

### 4.1. Ejemplo de aplicación

Si Ana registra una solicitud a las 8:00 a. m., Luis a las 8:10 a. m. y Pedro a las 8:20 a. m., el sistema debe atender primero a Ana, luego a Luis y finalmente a Pedro.

Esto demuestra que la estructura FIFO permite administrar correctamente las solicitudes académicas y respetar el orden de llegada.

---

## 5. Conclusión

La estructura de datos Cola FIFO permite organizar y administrar solicitudes académicas de manera ordenada, siguiendo el principio de primero en entrar, primero en salir.

Mediante las operaciones Enqueue, Dequeue, Front e IsEmpty es posible agregar solicitudes, atenderlas, consultar la siguiente pendiente y verificar si existen elementos en la cola.

Por lo tanto, concluimos que FIFO es una solución adecuada para los procesos de atención académica, ya que garantiza el respeto del orden de llegada y facilita la organización de las solicitudes.

---

**Fin de la Actividad 2 – Cola FIFO.**
