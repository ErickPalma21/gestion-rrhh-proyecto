package com.erick.rh.modelo;

/**
 * Representa un departamento dentro de la empresa.
 * La clase Departamento almacena información sobre un departamento y sus empleados.
 */
public class Departamento {
    private String nombre;
    private int numeroEmpleados;

    /**
     * Constructor de la clase Departamento.
     * @param nombre El nombre del departamento.
     * @param numeroEmpleados El número de empleados en el departamento.
     */
    public Departamento(String nombre, int numeroEmpleados) {
        this.nombre = nombre;
        this.numeroEmpleados = numeroEmpleados;
    }

    /**
     * Obtiene el nombre del departamento.
     * @return El nombre del departamento.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el número de empleados en el departamento.
     * @return El número de empleados en el departamento.
     */
    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }
}
