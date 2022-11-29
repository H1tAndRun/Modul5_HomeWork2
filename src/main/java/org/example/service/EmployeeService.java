package org.example.service;

import org.example.dto.EmployeeDto;
import org.example.entity.Employee;
import java.util.Map;

public interface EmployeeService {

    void createEmployee(EmployeeDto employeeDto);

    Map<Integer, Employee> getAllEmployee();

    void deleteEmployee(Integer id);

    Employee getEmployeeById(Integer id);

    void updateEmployee(EmployeeDto employeeDto);
}
