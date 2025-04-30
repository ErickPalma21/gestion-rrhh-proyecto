package com.erick;

import com.erick.rh.modelo.Empleado;

public class PruebaDepuracion {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", "Desarrollador", 2500.0);
        double salario = empleado.calcularSalarioMensual();
        System.out.println("Salario mensual: " + salario);
    }
}