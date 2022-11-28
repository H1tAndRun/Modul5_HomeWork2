package org.example.dao;

import org.example.entity.Employee;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    private Map<Integer, Employee> employeeData = new HashMap<>();

    private Integer countId = 0;

    @Override
    public void createEmployee(Employee employee) {
        ++countId;
        employee.setId(countId);
        employeeData.put(countId, employee);
    }

    @Override
    public Map<Integer, Employee> getAllEmployee() {
        return employeeData;
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeData.remove(id);
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeData.get(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeData.put(employee.getId(), employee);
    }
}
