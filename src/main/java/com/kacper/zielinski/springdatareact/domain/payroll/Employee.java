package com.kacper.zielinski.springdatareact.domain.payroll;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// TODO refactor to clear model
@Data
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String secondName;
    private String description;
}
