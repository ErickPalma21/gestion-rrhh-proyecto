package com.erick.rh.modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoTest {

    @Test
    public void testConstructor() {

        Empleado empleado = new Empleado("Juan", "Desarrollador", 3000);

        assertEquals("Juan", empleado.getNombre(), "El nombre del empleado no es correcto");

        assertEquals("Desarrollador", empleado.getPuesto(), "El puesto del empleado no es correcto");

        assertEquals(3000.0, empleado.getSalario(), 0.01, "El salario del empleado no es correcto");
    }

    @Test
    public void testCalcularSalarioMensual() {

        Empleado empleado = new Empleado("Juan", "Desarrollador", 3000);

        assertEquals(3000.0, empleado.calcularSalarioMensual(), 0.01, "El salario mensual no es correcto");
    }
}