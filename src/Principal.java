public class Principal {

    public static void main(String[] args) {

        Pila p1 = new Pila();

        p1.apilar(2);
        p1.apilar(1);
        p1.apilar(8);
        p1.apilar(9);
        p1.apilar(10);

        System.out.println(p1.sumarElementos());
    }

}
