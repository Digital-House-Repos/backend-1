package c01.segundo.service;

public abstract class Menu {
    protected double precioBase;
    protected double recargo;
    protected double precioFinal;

    public void armarMenu() {
        mostrarInstrucciones();
        calcularRecargo();
        calcularPrecioFinal();
        mostrarPrecioFinal();
    }

    protected abstract void mostrarInstrucciones();

    protected abstract void calcularRecargo();

    private void calcularPrecioFinal() {
        precioFinal = precioBase + recargo;
    }

    public void mostrarPrecioFinal() {
        System.out.println("El precio final es: " + precioFinal);
    }
}