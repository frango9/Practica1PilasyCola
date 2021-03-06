public class Principal {

    public static void main(String[] args) {

        System.out.println("\n***Prueba de sumarElementos***\n");

        Pila p1 = new Pila();

        p1.apilar(8);
        p1.apilar(1);
        p1.apilar(4);
        p1.apilar(2);

        System.out.println("Suma de p1: " + p1.sumarElementos());

        Pila p2 = new Pila();
        Pila p3 = new Pila();
        Pila p4 = new Pila();

        p2.apilar(8);
        p2.apilar(3);

        p3.apilar(2);
        p3.apilar(5);
        p3.apilar(7);
        p3.apilar(21);

        p4.apilar(1);
        p4.apilar(4);

        System.out.println("Suma de p2: " + sumElementos(p2));

        System.out.println("\n***Pruebas de unirPila***\n");

        p1.unirPila(p2);

        p1.escribirPila();

        unirPilas(p3, p4);

        p3.escribirPila();

        System.out.println("\n***Prueba de dejarN***\n");

        Cola c1 = new Cola();
        Cola c2 = new Cola();
        Cola c3 = new Cola();
        Cola c4 = new Cola();

        c1.encolar(20);
        c1.encolar(40);
        c1.encolar(10);
        c1.encolar(50);
        c2.encolar(20);
        c2.encolar(40);
        c2.encolar(10);
        c2.encolar(50);
        c3.encolar(20);
        c3.encolar(40);
        c3.encolar(10);
        c3.encolar(50);
        c4.encolar(20);
        c4.encolar(40);
        c4.encolar(10);
        c4.encolar(50);

        c1.dejarN(2);
        c1.escribirCola();

        c2.dejarN(4);
        c2.escribirCola();

        c3.dejarN(9);
        c3.escribirCola();

        c4.dejarN(0);
        c4.escribirCola();

        System.out.println("\n***Prueba de dejaN***\n");

        Cola c5 = new Cola();
        Cola c6 = new Cola();
        Cola c7 = new Cola();
        Cola c8 = new Cola();

        c5.encolar(20);
        c5.encolar(40);
        c5.encolar(10);
        c5.encolar(50);
        c6.encolar(20);
        c6.encolar(40);
        c6.encolar(10);
        c6.encolar(50);
        c7.encolar(20);
        c7.encolar(40);
        c7.encolar(10);
        c7.encolar(50);
        c8.encolar(20);
        c8.encolar(40);
        c8.encolar(10);
        c8.encolar(50);

        dejaN(2,c5);
        c5.escribirCola();

        dejaN(4,c6);
        c6.escribirCola();

        dejaN(9,c7);
        c7.escribirCola();

        dejaN(0,c8);
        c8.escribirCola();

    }

    public static int sumElementos(Pila p){
            int sum;
            int aux;

            sum = 0;

            if(!p.pilaVacia()){

                aux = p.desapilar();
                sum = aux + sumElementos(p);
                p.apilar(aux);

            }

            return sum;
    }

    public static void unirPilas (Pila p1, Pila p2){
        int aux;

        if(!p2.pilaVacia()){
            aux = p2.desapilar();
            unirPilas(p1,p2);
            p1.apilar(aux);
        }

        p2 = null;
    }

    public static void dejaN( int n, Cola c){

        int aux;
        aux = c.numElemCola();

        if(aux > n) {
            for (int i = 0; i < n; i++) {
                c.encolar(c.desencolar());
            }
            for (int j = 0; j < aux - n; j++) {
                c.desencolar();
            }
        }

    }
}
