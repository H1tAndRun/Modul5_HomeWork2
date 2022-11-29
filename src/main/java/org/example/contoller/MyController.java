package org.example.contoller;

import org.example.dto.EmployeeDto;
import org.example.entity.Employee;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MyController {

    private final EmployeeService employeeService;

    @Autowired
    public MyController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/create_employee")
    public void createEmployee(@RequestBody EmployeeDto employeeDto) {
        employeeService.createEmployee(employeeDto);
    }

    @GetMapping("/employees")
    public Map<Integer, Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/employees_update")
    public void updateEmployee(@RequestBody EmployeeDto employeeDto){
        employeeService.updateEmployee(employeeDto);
    }
}
