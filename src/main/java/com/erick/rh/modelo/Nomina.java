package com.erick.rh.modelo;

/**
 * Representa una nómina de un empleado.
 package com.erick.rh.modelo;

 /**
 * Representa la nómina de un empleado.
 * La clase Nomina se encarga de calcular el salario neto después de deducciones.
 */
public class Nomina {
    private double salario;
    private double deducciones;

    /**
     * Constructor de la clase Nomina.
     * @param salario El salario bruto del empleado.
     * @param deducciones Las deducciones aplicadas al salario del empleado.
     */
    public Nomina(double salario, double deducciones) {
        this.salario = salario;
        this.deducciones = deducciones;
    }

    /**
     * Calcula el salario neto después de deducciones.
     * @return El salario neto después de deducciones.
     */
    public double calcularSalarioNeto() {
        return salario - deducciones;  // Devuelve el salario neto
    }

    /**
     * Obtiene el salario bruto.
     * @return El salario bruto del empleado.
     */
    public double getSalario() {
        return salario;
    }
}