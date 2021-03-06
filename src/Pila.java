public class Pila {

    private Nodo cimaPila;
    private int numElementos;

    public Pila() {
        cimaPila = null;
        numElementos = 0;
    }


    public boolean pilaVacia() {

        return cimaPila == null;
    }

    public void apilar(int dato) {
        if (this.pilaVacia())
            cimaPila = new Nodo(dato, null);
        else {
            Nodo nuevo = new Nodo(dato, cimaPila);
            cimaPila = nuevo;
        }
        numElementos++;
    }

    public int desapilar() {
        int valor;
        if (this.pilaVacia()) {
            System.out.println("Error, la pila está vacía");
            valor = -9999;
        } else {
            valor = cimaPila.getDato();
            cimaPila = cimaPila.getSiguiente();
            numElementos--;
        }
        return valor;
    }

    public int cima() {
        int valor;
        if (this.pilaVacia()) {
            System.out.println("Error, la pila está vacía");
            valor = -9999;
        } else {
            valor = cimaPila.getDato();
        }
        return valor;
    }


    public int numElemPila() {
        return numElementos;
    }

    public void escribirPila() {
        Nodo aux = cimaPila;
        System.out.println("\nContenido de la pila");

        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }

    }

    public int sumarElementos(){

        Nodo aux = cimaPila;
        int suma = 0;

        while (aux != null) {
            suma += aux.getDato();
            aux = aux.getSiguiente();
        }

        return suma;
    }

    public void unirPila(Pila p){
        Nodo aux = p.cimaPila;

        while (aux.getSiguiente() != null){
            aux = aux.getSiguiente();
            numElementos++;
        }
        aux.setSiguiente(cimaPila);
        cimaPila = p.cimaPila;
        p.cimaPila = null;

    }


}