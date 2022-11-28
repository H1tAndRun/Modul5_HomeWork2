package org.example.dao;

import org.example.entity.Employee;
import java.util.Map;

public interface EmployeeDao {

    void createEmployee(Employee employee);

    Map<Integer, Employee> getAllEmployee();

    void deleteEmployee(Integer id);

    Employee getEmployeeById(Integer id);

    void updateEmployee(Employee employee);
}
