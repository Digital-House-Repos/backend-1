package c01.segundo.service.impl;

import c01.segundo.service.Menu;

public class MenuVegano extends Menu {
    private final boolean haveSpices;
    private final int sauces;

    public MenuVegano(boolean haveSpices, int sauces) {
        this.haveSpices = haveSpices;
        this.sauces = sauces;
        super.precioBase = 80;
    }

    @Override
    protected void mostrarInstrucciones() {
        System.out.println("Menú vegano - 1% de recargo por especias + 2$ por salsas");
        System.out.println("Precio base: " + super.precioBase);
    }

    @Override
    protected void calcularRecargo() {
        super.recargo = haveSpices ? super.precioBase * 0.01 : 0;
        super.recargo += sauces * 2;
        System.out.println("Recargo: " + super.recargo);
    }
}
