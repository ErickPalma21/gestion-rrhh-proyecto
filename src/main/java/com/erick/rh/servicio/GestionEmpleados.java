package com.erick.rh.servicio;

import com.erick.rh.modelo.Empleado;

/**
 * Servicio para gestionar la información de los empleados.
 * Esta clase contiene métodos para agregar, eliminar y consultar empleados.
 */
public class GestionEmpleados {

    /**
     * Agrega un nuevo empleado al sistema.
     * @param nombre El nombre del empleado.
     * @param puesto El puesto del empleado.
     * @param salario El salario mensual del empleado.
     * @return El empleado agregado.
     */
    public Empleado agregarEmpleado(String nombre, String puesto, double salario) {
        return new Empleado(nombre, puesto, salario);
    }

    /**
     * Elimina un empleado del sistema.
     * @param empleado El empleado que se va a eliminar.
     */
    public void eliminarEmpleado(Empleado empleado) {

    }
}