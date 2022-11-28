package org.example.mapper;

import org.example.dto.EmployeeDto;
import org.example.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    public Employee convertEmployeeRq(EmployeeDto employeeDtoRq) {
        return new Employee(employeeDtoRq.getName(),employeeDtoRq.getAge(),employeeDtoRq.getSalary());
    }
}
