package c03.a;

public class ArbolDemo {
    public static void main(String[] args) {
        Bosque bosque = new Bosque();

        for (int i = 0; i < 500000; i++) {
            bosque.addArbol(ArbolFactory.getArbol("Ornamental"));
            bosque.addArbol(ArbolFactory.getArbol("Frutal"));
        }

        bosque.showArboles();

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));

    }
}
