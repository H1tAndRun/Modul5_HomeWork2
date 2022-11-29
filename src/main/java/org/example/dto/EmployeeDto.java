package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class EmployeeDto {

    private Integer id;

    private String name;

    private Integer age;

    private BigDecimal salary;
}
