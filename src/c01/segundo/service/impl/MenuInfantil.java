package c01.segundo.service.impl;

import c01.segundo.service.Menu;

public class MenuInfantil extends Menu {
    private final int toys;

    public MenuInfantil(int toys) {
        this.toys = toys;
        super.precioBase = 50;
    }

    @Override
    protected void mostrarInstrucciones() {
        System.out.println("Menú infantil - 3$ por juguete");
        System.out.println("Precio base: " + super.precioBase);
    }

    @Override
    protected void calcularRecargo() {
        super.recargo = toys * 3;
        System.out.println("Recargo: " + super.recargo);
    }
}
