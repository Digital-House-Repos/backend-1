package c03.a;

import java.util.ArrayList;

public class Bosque {
    ArrayList<Arbol> arboles = new ArrayList<>();

    public void addArbol(Arbol arbol) {
        arboles.add(arbol);
    }

    public void showArboles() {
        for (Arbol arbol : arboles) {
            System.out.println(arbol);
        }
    }
}
