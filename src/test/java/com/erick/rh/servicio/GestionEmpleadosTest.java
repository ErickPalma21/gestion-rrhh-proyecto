package com.erick.rh.servicio;

import com.erick.rh.modelo.Empleado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GestionEmpleadosTest {

    @Test
    public void testAgregarEmpleado() {

        GestionEmpleados gestionEmpleados = new GestionEmpleados();

        Empleado empleado = gestionEmpleados.agregarEmpleado("Juan", "Desarrollador", 3000);

        assertEquals("Juan", empleado.getNombre(), "El nombre del empleado no es correcto");

        assertEquals("Desarrollador", empleado.getPuesto(), "El puesto del empleado no es correcto");

        assertEquals(3000.0, empleado.getSalario(), 0.01, "El salario del empleado no es correcto");
    }

    @Test
    public void testEliminarEmpleado() {

        GestionEmpleados gestionEmpleados = new GestionEmpleados();

        Empleado empleado = new Empleado("Juan", "Desarrollador", 3000);

        gestionEmpleados.eliminarEmpleado(empleado);

        assertTrue(true, "El método eliminarEmpleado no lanza ningún error.");
    }
}