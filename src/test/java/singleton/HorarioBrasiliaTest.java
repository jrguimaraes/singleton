package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HorarioBrasiliaTest {

    @Test
    public void deveRetornarPais() {
        HorarioBrasilia.getInstance().setPais("Brasil");
        assertEquals("Brasil", HorarioBrasilia.getInstance().getPais());
    }

    @Test
    public void deveRetornarHorario() {
        HorarioBrasilia.getInstance().setHorario(00.00);
        assertEquals(00.00, HorarioBrasilia.getInstance().getHorario());
    }
}