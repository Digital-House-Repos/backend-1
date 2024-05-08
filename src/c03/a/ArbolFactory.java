package c03.a;

import java.util.HashMap;

public class ArbolFactory {
    public static HashMap<String, Arbol> arbolCache = new HashMap<>();

    public static Arbol getArbol(String tipo) {
        Arbol arbolFound = arbolCache.get(tipo);

        if (arbolFound == null) {
            switch (tipo) {
                case "Floral":
                    arbolFound = new ArbolFloral();
                    System.out.println("Creando nuevo árbol: " + tipo);
                    break;
                case "Ornamental":
                    arbolFound = new ArbolOrnamental();
                    System.out.println("Creando nuevo árbol: " + tipo);
                    break;
                case "Frutal":
                    arbolFound = new ArbolFrutal();
                    System.out.println("Creando nuevo árbol: " + tipo);
                    break;
                default:
                    System.out.println("Tipo de árbol no encontrado: " + tipo);
                    break;
            }
            arbolCache.put(tipo, arbolFound);
        }
        return arbolFound;
    }

}
