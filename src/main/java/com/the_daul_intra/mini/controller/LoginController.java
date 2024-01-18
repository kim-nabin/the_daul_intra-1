package com.the_daul_intra.mini.controller;

import com.the_daul_intra.mini.dto.entity.Employee;
import com.the_daul_intra.mini.repository.LoginRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class LoginController {

    private final LoginRepository repository;

    LoginController(LoginRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/Login")
    public String login(@RequestBody Employee loginEmployee, Model model) {
        Employee employee = repository.findByEmail(loginEmployee.getEmail());
        if (employee != null && employee.getPassword().equals(loginEmployee.getPassword())) {
            return "redirect:/dashboard";
        } else {
            model.addAttribute("error", "Invalid email or password");
            return "Login";
        }
    }

    // Create
    @PostMapping("/employee")
    Employee createEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }

    // Read
    @GetMapping("/Login")
    List<Employee> readAllEmployees() {
        return repository.findAll();
    }

    @GetMapping("/Login/{id}")
    Employee readEmployee(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Could not find employee " + id));
    }

    // Update
    @PutMapping("/Login/{id}")
    Employee updateEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
        return repository.findById(id)
                .map(employee -> {
                    Employee updatedEmployee = Employee.builder()
                            .id(employee.getId())
                            .email(newEmployee.getEmail())
                            .password(newEmployee.getPassword())
                            .adminStatus(newEmployee.getAdminStatus())
                            .build();
                    return repository.save(updatedEmployee);
                })
                .orElseGet(() -> {
                    Employee employeeWithId = Employee.builder()
                            .id(id)
                            .email(newEmployee.getEmail())
                            .password(newEmployee.getPassword())
                            .adminStatus(newEmployee.getAdminStatus())
                            .build();
                    return repository.save(employeeWithId);
                });
    }



    // Delete
    @DeleteMapping("/Login/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}