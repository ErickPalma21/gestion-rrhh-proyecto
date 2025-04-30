Feature: Cálculo de salario mensual

  Scenario: Calcular salario mensual para un empleado
    Given un empleado llamado "Erick" con el puesto "Desarrollador" y un salario de 2500
    When se calcula el salario mensual
    Then el resultado debe ser 2500