package org.example.entity;

import lombok.Data;
import lombok.NonNull;
import java.math.BigDecimal;

@Data
public class Employee {

    private Integer id;

    @NonNull
    private String name;

    @NonNull
    private Integer age;

    @NonNull
    private BigDecimal salary;
}
