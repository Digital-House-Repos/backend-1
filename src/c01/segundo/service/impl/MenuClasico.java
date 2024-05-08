package c01.segundo.service.impl;

import c01.segundo.service.Menu;

public class MenuClasico extends Menu {
    public MenuClasico() {
        super.precioBase = 100;
    }

    @Override
    protected void mostrarInstrucciones() {
        System.out.println("Menú clásico - no tiene recargo");
        System.out.println("Precio base: " + super.precioBase);
    }

    @Override
    protected void calcularRecargo() {
        super.recargo = 0;
    }
}
