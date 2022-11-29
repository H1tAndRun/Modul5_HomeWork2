package org.example.service;

import org.example.dao.EmployeeDao;
import org.example.dto.EmployeeDto;
import org.example.entity.Employee;
import org.example.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDao employeeDao;

    private final EmployeeMapper employeeMapper;

    @Autowired
    public EmployeeServiceImpl(EmployeeMapper employeeMapper, EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
        this.employeeMapper = employeeMapper;
    }

    @Override
    public void createEmployee(EmployeeDto employeeDto) {
        Employee employee = employeeMapper.convertEmployeeRq(employeeDto);
        employeeDao.createEmployee(employee);
    }

    @Override
    public Map<Integer, Employee> getAllEmployee() {
        return employeeDao.getAllEmployee();
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeDao.deleteEmployee(id);
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeDao.getEmployeeById(id);
    }

    @Override
    public void updateEmployee(EmployeeDto employeeDto) {
        Employee employee = employeeMapper.convertEmployeeRq(employeeDto);
        employeeDao.updateEmployee(employee);
    }
}
