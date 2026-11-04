# Actividad 3: Selección de estructura para situaciones reales

**Responsable:** Percy Daniel Perez Rojas
**Evaluación:** PA3 – Grupo 7

---

## Criterio de decisión del equipo

Tanto la pila como la cola son estructuras lineales de **acceso restringido** y sus operaciones básicas son de complejidad **O(1)**. Por lo tanto, la elección entre una y otra **no se resuelve por eficiencia**, sino por una sola pregunta:

> ¿En qué orden deben **salir** los elementos respecto del orden en que **entraron**?

| Si el orden de salida es… | Estructura | Principio | Se inserta por | Se retira por |
|---|---|---|---|---|
| **Inverso** al de entrada | **Pila** | LIFO — *Last In, First Out* | el tope | el tope |
| **El mismo** que el de entrada | **Cola** | FIFO — *First In, First Out* | el final (`rear`) | el frente (`front`) |

En la unidad de servicios académicos del caso, las acciones que deben revertirse exigen orden inverso, mientras que la atención de solicitudes exige respetar el orden de llegada. De ahí que el sistema requiera **ambas estructuras**, cada una en la parte del flujo que le corresponde.

---

## Tabla de decisión

| # | Situación | Estructura | Operaciones que la resuelven |
|---|---|---|---|
| 1 | Registro de acciones recientes para revertir cambios | **Pila (LIFO)** | `push()` al registrar, `pop()` al deshacer |
| 2 | Atención de solicitudes en orden de llegada | **Cola (FIFO)** | `encolar()` al recibir, `desencolar()` al atender |
| 3 | Procesamiento donde el último ingresado debe atenderse primero | **Pila (LIFO)** | `push()` al ingresar, `pop()` al procesar |
| 4 | Flujo de espera de trámites pendientes | **Cola (FIFO)** | `encolar()` al generar el trámite, `desencolar()` al resolverlo |

---

## 1. Registro de acciones recientes para revertir cambios → **Pila (LIFO)**

**Justificación técnica.** Deshacer un cambio solo es seguro si se revierte **el más reciente primero**: cada acción se aplicó sobre el estado que dejó la anterior, de modo que revertirlas fuera de orden produciría un estado inconsistente. Ese orden inverso es exactamente el principio LIFO, y la pila lo garantiza por construcción, porque el único elemento accesible es el del tope.

**Funcionamiento.** Cada acción registrada se apila con `push()`. Al pulsar "deshacer", `pop()` retira la del tope, que es siempre la última registrada.

```
Se registran A1, A2, A3 y A4 en ese orden:

        ┌────────┐ ← tope
        │   A4   │  ← primer pop()  (último en entrar)
        │   A3   │  ← segundo pop()
        │   A2   │
        │   A1   │  ← último pop()  (primero en entrar)
        └────────┘
```

**Contraejemplo.** Con una cola, el primer "deshacer" revertiría **A1**, la acción más antigua, dejando aplicadas A2, A3 y A4 sobre un estado que ya no existe. El sistema quedaría corrupto.

---

## 2. Atención de solicitudes en orden de llegada → **Cola (FIFO)**

**Justificación técnica.** El enunciado fija un criterio de **equidad**: quien llega primero se atiende primero. La cola lo implementa de forma estructural, no por disciplina del programador: los elementos entran por `rear` y solo pueden salir por `front`, por lo que es imposible adelantar a nadie.

**Funcionamiento.** Cada solicitud recibida se inserta con `encolar()` al final; el operador atiende con `desencolar()`, que retira siempre la del frente.

```
  front                                          rear
    ↓                                              ↓
  [ S001 ] → [ S002 ] → [ S003 ] → [ S004 ]
    ↑                                              ↑
  sale por aquí (desencolar)        entra por aquí (encolar)
```

**Contraejemplo.** Con una pila se atendería primero la solicitud más reciente. Si el flujo de ingreso es continuo, las primeras solicitudes **nunca llegarían a atenderse**: es el problema de la *inanición* (starvation), y además viola el criterio de orden de llegada que el caso exige.

---

## 3. Procesamiento donde el último ingresado debe atenderse primero → **Pila (LIFO)**

**Justificación técnica.** El enunciado es la definición literal de LIFO: *el último en entrar es el primero en salir*. La pila es la única de las dos estructuras que ofrece ese comportamiento, porque su único punto de acceso —el tope— contiene siempre el elemento más reciente.

**Funcionamiento.** Cada elemento ingresado se apila con `push()`; el procesamiento consume siempre el tope con `pop()`, sin recorrer el resto.

```
Entran E1, E2, E3 →  se procesan E3, E2, E1
                     (orden de salida inverso al de entrada)
```

**Diferencia con la situación 1.** Aunque ambas usan pila, la razón no es la misma: en la situación 1 el orden inverso es una **exigencia de correctitud** (no se puede revertir un cambio antes que el posterior); aquí es una **regla de prioridad del proceso** (lo más reciente tiene preferencia). Conviene explicitarlo, porque demuestra que la estructura se eligió por análisis del flujo y no por coincidencia de palabras.

---

## 4. Flujo de espera de trámites pendientes → **Cola (FIFO)**

**Justificación técnica.** Un "flujo de espera" es, por definición, una línea de turnos: los trámites pendientes aguardan y se resuelven en el orden en que ingresaron. La cola modela ese comportamiento de forma directa y, al igual que en la situación 2, garantiza que ningún trámite quede postergado indefinidamente.

**Funcionamiento.** El trámite generado se inserta con `encolar()`; al liberarse un responsable, `desencolar()` entrega el trámite del frente.

```
Estado de la cola de trámites pendientes:

  front                                 rear
    ↓                                     ↓
  [ T-001 ][ T-002 ][ T-003 ][ T-004 ]

  Se resuelve T-001 → desencolar() → front avanza a T-002
```

**Contraejemplo.** Con una pila, un trámite antiguo quedaría sepultado bajo cada nuevo ingreso y podría no resolverse nunca mientras el flujo de entrada se mantenga. En un flujo de espera, la pila produce inanición; la cola, por diseño, no.

**Precisión necesaria.** La cola simple es la estructura correcta **siempre que todos los trámites tengan la misma prioridad**. Si la unidad de servicios académicos definiera trámites urgentes que deben adelantarse, FIFO dejaría de ser suficiente y se requeriría una **cola de prioridad**, que no es ni una pila ni una cola simple. Como el caso no plantea niveles de urgencia, la cola FIFO es la elección adecuada.

---

## Lectura transversal de las cuatro situaciones

Las cuatro situaciones se agrupan en dos pares, y reconocerlo es parte del análisis:

- **Situaciones 1 y 3 → pila**, pero por motivos distintos: la primera por una exigencia de **reversibilidad**, la tercera por una regla de **prioridad de lo más reciente**.
- **Situaciones 2 y 4 → cola**, ambas por la misma razón: el proceso impone **equidad en el orden de llegada** y debe evitar la inanición.

El elemento que decide en los cuatro casos no es el tipo de dato almacenado ni el volumen de información, sino **la relación entre el orden de entrada y el orden de salida que el proceso exige**.

---

## Conclusión

La selección entre pila y cola no es una preferencia de implementación: es una consecuencia directa del flujo del problema. Cuando el proceso exige revertir o priorizar lo más reciente, la única estructura correcta es la **pila**, porque su acceso restringido al tope impide salirse del orden inverso. Cuando el proceso exige respetar turnos, la única estructura correcta es la **cola**, porque su separación entre `front` y `rear` hace estructuralmente imposible adelantar a quien llegó antes.

Elegir mal la estructura no produce un programa más lento —ambas operan en O(1)—, sino un programa **funcionalmente incorrecto**: un historial que corrompe el documento o una ventanilla que nunca atiende a los primeros. Esa es la razón por la que la unidad de servicios académicos necesita las dos estructuras operando en paralelo, cada una en el tramo del flujo que le corresponde.