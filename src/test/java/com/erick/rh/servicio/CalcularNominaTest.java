package com.erick.rh.servicio;

import com.erick.rh.modelo.Nomina;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalcularNominaTest {

    @Test
    public void testCalcularSalarioNeto() {

        Nomina mockNomina = Mockito.mock(Nomina.class);

        when(mockNomina.calcularSalarioNeto()).thenReturn(2500.0);

        CalcularNomina calcularNomina = new CalcularNomina();

        double salarioNeto = calcularNomina.calcularSalarioNeto(mockNomina);

        assertEquals(2500.0, salarioNeto, "El salario neto calculado no es correcto");

        verify(mockNomina, times(1)).calcularSalarioNeto();
    }
}