public class PilaAcciones {

    static class Nodo {
        String accion;
        Nodo siguiente;

        Nodo(String accion) {
            this.accion = accion;
            this.siguiente = null;
        }
    }

    static class Pila {
        private Nodo tope;

        Pila() {
            tope = null;
        }

        public void push(String accion) {
            Nodo nuevo = new Nodo(accion);
            nuevo.siguiente = tope;
            tope = nuevo;
        }

        public String pop() {
            if (tope == null) {
                System.out.println("La pila esta vacia");
                return null;
            }
            String accionEliminada = tope.accion;
            tope = tope.siguiente;
            return accionEliminada;
        }

        public String peek() {
            if (tope == null) {
                System.out.println("La pila esta vacia");
                return null;
            }
            return tope.accion;
        }

        public boolean isEmpty() {
            return tope == null;
        }
    }


    public static void main(String[] args) {
        Pila pila = new Pila();
        System.out.println("===== PILA DE ACCIONES ACADEMICAS =====");

        System.out.println("\n----- ESTADO INICIAL -----");
        System.out.println("Inicialmente vacia: " + pila.isEmpty());

        System.out.println("\n----- OPERACION PUSH -----");
        pila.push("A001 - Registrar matricula");
        pila.push("A002 - Modificar horario");
        pila.push("A003 - Actualizar curso");
        System.out.println("Se registraron las acciones A001, A002 y A003");

        System.out.println("\n----- OPERACION PEEK -----");
        System.out.println("Tope actual: " + pila.peek());
        System.out.println("Consultar otra vez: " + pila.peek());

        System.out.println("\n----- OPERACION POP -----");
        System.out.println("Accion deshecha: " + pila.pop());
        System.out.println("Nuevo tope: " + pila.peek());
        System.out.println("Pila vacia: " + pila.isEmpty());

        System.out.println("\n----- VACIAR LA PILA -----");
        System.out.println("Accion deshecha: " + pila.pop());
        System.out.println("Accion deshecha: " + pila.pop());
        System.out.println("Pila vacia al final: " + pila.isEmpty());

        System.out.println("\n----- PRUEBA DE PILA VACIA -----");
        System.out.println("Intentando desapilar una pila vacia:");
        System.out.println("Resultado: " + pila.pop());

        System.out.println("\n===== FIN DEL PROGRAMA =====");
    }

}
