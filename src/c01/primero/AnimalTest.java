package c01.primero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    public void siElAnimalEsPesadoYGrande() {
        Animal caballo = new Animal(3000, "caballo", "grande");
        Animal perro = new Animal(20, "perro", "mediano");

        boolean esPesado1 = caballo.esPesado();
        boolean esPesado2 = perro.esPesado();

        assertEquals(true, esPesado1);
        assertTrue(esPesado1);
        assertFalse(esPesado2);
    }
}