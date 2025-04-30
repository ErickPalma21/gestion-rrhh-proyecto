package com.erick.rh.modelo;

/**
 * Representa a un empleado del sistema.
 * La clase Empleado contiene información básica sobre un empleado y proporciona
 * un método para calcular el salario mensual.
 */
public class Empleado {
    private String nombre;
    private String puesto;
    private double salario;

    /**
     * Constructor de la clase Empleado.
     * @param nombre El nombre del empleado.
     * @param puesto El puesto que ocupa el empleado.
     * @param salario El salario mensual del empleado.
     */
    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    /**
     * Obtiene el nombre del empleado.
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el puesto del empleado.
     * @return El puesto del empleado.
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * Obtiene el salario del empleado.
     *
     * @return El salario mensual del empleado.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Calcula el salario mensual.
     * Este método es provisional y retorna un valor estático.
     * @return El salario mensual calculado (provisional).
     */
    public double calcularSalarioMensual() {
        return salario;
    }
}
