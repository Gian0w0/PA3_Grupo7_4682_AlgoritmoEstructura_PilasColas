# Actividad 4. Comparación y argumentación

## Comparación académica entre pila (LIFO) y cola (FIFO)

| Aspecto | Pila (LIFO) | Cola (FIFO) |
|---------|-------------|-------------|
| **Principio de funcionamiento** | Last In, First Out. El último elemento que entra es el primero que sale. | First In, First Out. El primer elemento que entra es el primero que sale. |
| **Operaciones principales** | - push / apilar (insertar en el tope)<br>- pop / desapilar (eliminar del tope)<br>- peek / top (consultar el tope sin eliminar)<br>- isEmpty (verificar si está vacía) | - enqueue / encolar (insertar al final)<br>- dequeue / desencolar (eliminar del frente)<br>- front / peek (consultar el frente sin eliminar)<br>- isEmpty (verificar si está vacía) |
| **Forma de acceso** | Solo se accede al extremo superior (tope). No se permite acceso aleatorio ni al fondo. | Se accede por ambos extremos: inserción por el final y extracción por el frente. Tampoco permite acceso aleatorio. |
| **Ventajas en contextos de aplicación** | Ideal cuando se necesita deshacer acciones en orden inverso (Ctrl+Z, historial de navegación, evaluación de expresiones, backtracking, llamadas a funciones/recursión). Garantiza que la última acción registrada sea la primera en revertirse. | Ideal cuando el orden de llegada debe respetarse (colas de atención, impresión de documentos, solicitudes de servicio, procesamiento de tareas pendientes). Garantiza equidad y orden cronológico. |

## Aplicación al caso propuesto

En la unidad de servicios académicos:

- **Pila**: se usa para gestionar acciones que deben deshacerse en orden inverso (por ejemplo, deshacer modificaciones en un expediente o revertir cambios realizados por un usuario).
- **Cola**: se usa para atender solicitudes en el mismo orden en que llegan (por ejemplo, trámites o tickets de estudiantes).

## Conclusión grupal

La selección correcta de la estructura de datos (pila o cola) es fundamental porque determina directamente la eficiencia, la corrección y la claridad de la solución. Usar una pila cuando se requiere revertir acciones garantiza que el sistema respete el orden natural de deshacer (LIFO), evitando errores lógicos y facilitando la implementación de funcionalidades como “deshacer”. Usar una cola cuando se debe atender en orden de llegada asegura justicia y predictibilidad en el servicio (FIFO), evitando que solicitudes posteriores se procesen antes que las anteriores.

Elegir la estructura adecuada no solo resuelve el problema de forma correcta, sino que también mejora la mantenibilidad del código, reduce la complejidad innecesaria y permite que el sistema se comporte de manera intuitiva y coherente con los requisitos del negocio. Una mala elección (por ejemplo, usar una cola para deshacer o una pila para atención secuencial) generaría comportamientos incorrectos y frustración en los usuarios. Por tanto, el análisis previo del flujo del problema y la justificación técnica de la estructura elegida son pasos indispensables para una solución de calidad.
