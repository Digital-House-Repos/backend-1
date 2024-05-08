package c01.segundo;

import c01.segundo.service.impl.MenuClasico;
import c01.segundo.service.impl.MenuInfantil;
import c01.segundo.service.impl.MenuVegano;

public class Demo {
    public static void main(String[] args) {
        MenuClasico menuClasico = new MenuClasico();
        menuClasico.armarMenu();

        System.out.println();
        MenuInfantil menuInfantil = new MenuInfantil(2);
        menuInfantil.armarMenu();

        System.out.println();
        MenuVegano menuVegano = new MenuVegano(true, 3);
        menuVegano.armarMenu();

        System.out.println();
        MenuVegano menuVegano2 = new MenuVegano(false, 1);
        menuVegano2.armarMenu();
    }
}
