package c01.primero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreasTest {

    @Test
    public void testArea() {
        String res1 = Areas.calcularArea("cuadrado", 5);
        assertEquals("El area del cuadrado es 25.0 unidades cuadradas", res1);

        String res2 = Areas.calcularArea("cuadrado", 0);
        assertEquals("El valor de la unidad debe ser mayor a 0", res2);

        String res3 = Areas.calcularArea("cuadrado", -5);
        assertEquals("El valor de la unidad debe ser mayor a 0", res3);

        String res4 = Areas.calcularArea("circulo", 5);
        assertEquals("El area del circulo es 78.53981633974483 unidades cuadradas", res4);

        String res5 = Areas.calcularArea("circulo", 0);
        assertEquals("El valor de la unidad debe ser mayor a 0", res5);

        String res6 = Areas.calcularArea("circulo", -5);
        assertEquals("El valor de la unidad debe ser mayor a 0", res6);

        String res7 = Areas.calcularArea("triangulo", 5);
        assertEquals("Figura no disponible", res7);
    }
}