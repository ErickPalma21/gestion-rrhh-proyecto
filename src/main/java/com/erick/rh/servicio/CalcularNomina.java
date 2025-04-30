package com.erick.rh.servicio;

import com.erick.rh.modelo.Nomina;

/**
 * Servicio para calcular la nómina de los empleados.
 * Esta clase tiene métodos para calcular el salario neto y otros aspectos relacionados con las nóminas.
 */
public class CalcularNomina {

    /**
     * Calcula el salario neto de un empleado después de deducciones.
     * @param nomina La nómina del empleado.
     * @return El salario neto después de deducciones.
     */
    public double calcularSalarioNeto(Nomina nomina) {
        return nomina.calcularSalarioNeto();
    }
}