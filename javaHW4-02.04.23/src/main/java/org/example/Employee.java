package org.example;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private final long id;
    private int workingHours;
    private ContractType contractType;
    private BigDecimal minSalary;
    private BigDecimal additionalSalary;
    private static long numberOfEmployees = 0;

    public Employee(String name, int workedHours, ContractType contractType, BigDecimal additionalSalary) {
        this.name = name;
        this.workingHours = workedHours;
        this.contractType = contractType;
        this.additionalSalary = additionalSalary;

    }
}
