package com.erick.rh.steps;

import com.erick.rh.modelo.Empleado;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class EmpleadoSteps {

    private Empleado empleado;
    private double salarioNeto;

    @Given("un empleado con nombre {string}, puesto {string} y salario de {double}")
    public void givenUnEmpleadoConNombrePuestoYSalario(String nombre, String puesto, double salario) {
        empleado = new Empleado(nombre, puesto, salario);
    }

    @When("calculo su salario neto")
    public void whenCalculoSuSalarioNeto() {
        // Simulamos una deducción del 10% al salario
        double salarioBruto = empleado.calcularSalarioMensual();
        salarioNeto = salarioBruto - (salarioBruto * 0.10);
    }

    @Then("el salario neto debe ser {double}")
    public void thenElSalarioNetoDebeSer(double salarioEsperado) {
        assertEquals(salarioEsperado, salarioNeto, 0.01);
    }
}
