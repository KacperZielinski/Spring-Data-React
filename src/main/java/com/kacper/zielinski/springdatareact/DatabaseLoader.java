package com.kacper.zielinski.springdatareact;

import com.kacper.zielinski.springdatareact.domain.payroll.Employee;
import com.kacper.zielinski.springdatareact.domain.payroll.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    public DatabaseLoader(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        employeeRepository.save(
                new Employee(1L,"Kacper", "Zielinski", "Student"));
    }
}
