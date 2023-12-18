package pro.sky.skypro.service;

import pro.sky.skypro.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Employee addsEmployee(String firstName, String surName);

    Employee removeEmployee(String firstName, String surName);

    Employee findEmployee(String firstName, String lastName);

    Collection<Employee> findAll();
}