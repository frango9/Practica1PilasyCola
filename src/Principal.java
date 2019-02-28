public class Principal {

    public static void main(String[] args) {

        Pila p1 = new Pila();

        p1.apilar(8);
        p1.apilar(1);
        p1.apilar(4);
        p1.apilar(2);

        System.out.println(p1.sumarElementos());

        Pila p2 = new Pila();
        Pila p3 = new Pila();


        p2.apilar(8);
        p2.apilar(3);

        System.out.println(p2.sumarElementos());
        System.out.println(p3.sumarElementos());

        System.out.println("*****************");
        p1.unirPila(p2);
    }

}
