# PA3 – Evaluación aplicada sobre pilas y colas

**Curso:** Algoritmo y Estructura de Datos Basados en Inteligencia Artificial  
**Código:** 30710  
**Evaluación:** PA3  
**Equipo:** Grupo 7  
**Integrantes:** 4

## 1. Integrantes y responsabilidades

| Integrante | Actividad asignada | Aporte principal |
|---|---|---|
| Joseph Gianmarco Soberon Leon | Actividad 1 y coordinación | Pila LIFO: características, representación gráfica, algoritmos y coordinación de la documentación final. |
| Claudio Garcia Perez | Actividad 2 | Cola FIFO: características, representación gráfica, algoritmos y aplicación al caso. |
| Percy Daniel Perez Rojas | Actividad 3 | Selección de pila o cola en cuatro situaciones reales y justificación técnica. |
| Gustavo Aarón Cruz Mírez | Actividad 4 | Comparación académica entre pilas y colas, y conclusión grupal argumentada. |

**Participación:** Cada integrante desarrollará, documentará y expondrá su actividad. Todos contribuirán al repositorio mediante sus propias cuentas de GitHub.

## 2. Descripción y objetivo

### Problema

Una unidad de servicios académicos necesita dos mecanismos distintos: uno para gestionar acciones que deben deshacerse en orden inverso al que fueron registradas y otro para atender solicitudes en el mismo orden en que llegan.

### Objetivo

Seleccionar y justificar el uso de pilas (LIFO) y colas (FIFO) para representar ambos procesos, mediante diagramas, pseudocódigo y una solución coherente para el caso.

### Solución propuesta

Usar una **pila LIFO** para registrar y deshacer acciones recientes, y una **cola FIFO** para administrar solicitudes académicas por orden de llegada. Las cuatro actividades analizarán este mismo caso.

## 3. Actividades del proyecto

### Actividad 1 – Pila LIFO

**Responsable: Joseph**

- Explicación del principio LIFO (*Last In, First Out*).
- Representación gráfica de una pila aplicada al caso.
- Algoritmos para apilar (`push`), desapilar (`pop`), visualizar el tope (`peek`) y comprobar si está vacía (`isEmpty`).
- Justificación de su uso para deshacer acciones recientes.

### Actividad 2 – Cola FIFO

**Responsable: Claudio**

- Explicación del principio FIFO (*First In, First Out*).
- Representación gráfica de una cola aplicada al caso.
- Algoritmos para encolar (`enqueue`), desencolar (`dequeue`), visualizar el frente (`front`) y comprobar si está vacía (`isEmpty`).
- Justificación de su uso para atender solicitudes por orden de llegada.

### Actividad 3 – Selección de estructura para situaciones reales

**Responsable: Percy**

- Identificar y justificar si corresponde usar pila o cola para:
  1. Registrar acciones recientes para revertir cambios.
  2. Atender solicitudes en orden de llegada.
  3. Procesar primero el último elemento ingresado.
  4. Gestionar el flujo de espera de trámites pendientes.
- Explicar técnicamente cada elección en relación con LIFO o FIFO.

### Actividad 4 – Comparación y argumentación

**Responsable: Gustavo**

- Comparar pilas y colas según principio de funcionamiento, operaciones principales, forma de acceso y ventajas de aplicación.
- Explicar por qué cada estructura resulta adecuada para el proceso correspondiente.
- Redactar una conclusión grupal argumentada sobre la importancia de elegir correctamente la estructura de datos.

## 4. Organización del repositorio

| Rama | Responsable | Contenido |
|---|---|---|
| `main` | Equipo | Versión final integrada |
| `actividad-1` | Joseph | Pila LIFO |
| `actividad-2` | Claudio | Cola FIFO |
| `actividad-3` | Percy | Selección y justificación de estructuras |
| `actividad-4` | Gustavo | Comparación y conclusión grupal |

Cada integrante trabajará desde su cuenta personal y enviará sus cambios mediante un Pull Request para incorporarlos a `main`.

## 5. Cómo ejecutar o revisar

### Requisitos previstos

- Acceso al repositorio de GitHub.
- Navegador para visualizar el README y los archivos del repositorio.
- Java y JDK compatible, si el equipo incorpora programas ejecutables como evidencia adicional.

### Pasos de revisión

1. Acceder al repositorio.
2. Revisar el contenido de cada actividad en su rama o en la versión integrada de `main`.
3. Consultar los diagramas, pseudocódigos y justificaciones.
4. Consultar la solución grupal documentada en el README.
5. Si se incorpora código ejecutable, seguir las instrucciones específicas que se agreguen al repositorio.

## 6. Evidencias del proyecto

Se incorporarán progresivamente:

- Diagramas de pila y cola.
- Pseudocódigo de las operaciones solicitadas.
- Justificaciones técnicas de las cuatro situaciones.
- Cuadro comparativo y conclusión grupal.
- Historial de commits y Pull Requests.
- Enlace al video de exposición en YouTube.

## 7. Matriz de participación

| Integrante | Desarrollo asignado | Documentación | Exposición | Evidencia GitHub |
|---|---|---|---|---|
| Joseph Gianmarco Soberon Leon | Actividad 1 y coordinación | Pendiente | Pendiente | Pendiente |
| Claudio Garcia Perez | Actividad 2 | Pendiente | Pendiente | Pendiente |
| Percy Daniel Perez Rojas | Actividad 3 | Pendiente | Pendiente | Pendiente |
| Gustavo Aarón Cruz Mírez | Actividad 4 | Pendiente | Pendiente | Pendiente |

La matriz se actualizará según las contribuciones reales de cada integrante.

## 8. Video de exposición

**Enlace:** Pendiente de publicación.

Todos los integrantes participarán con cámaras encendidas y explicarán cómo resolvieron la evaluación y por qué eligieron una pila o una cola en cada situación.

## 9. Conclusiones

Las conclusiones se incorporarán una vez que el equipo haya desarrollado y revisado las cuatro actividades. La actividad 4 reunirá la conclusión grupal argumentada.
