package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    List<Customer> customers = Arrays.asList(
        new Customer(1, "Ravi", "ravi@gmail.com"),
        new Customer(2, "Sita", "sita@gmail.com"),
        new Customer(3, "Ram", "ram@gmail.com"),
        new Customer(4, "Priya", "priya@gmail.com"),
        new Customer(5, "Arun", "arun@gmail.com"),
        new Customer(6, "Kiran", "kiran@gmail.com"),
        new Customer(7, "Anu", "anu@gmail.com"),
        new Customer(8, "Vijay", "vijay@gmail.com"),
        new Customer(9, "Sneha", "sneha@gmail.com"),
        new Customer(10, "Manoj", "manoj@gmail.com"),
        new Customer(11, "Divya", "divya@gmail.com"),
        new Customer(12, "Teja", "teja@gmail.com"),
        new Customer(13, "Pavan", "pavan@gmail.com"),
        new Customer(14, "Nisha", "nisha@gmail.com"),
        new Customer(15, "Karthik", "karthik@gmail.com")
    );

    @GetMapping
    public List<Customer> getCustomers(
            @RequestParam int s,
            @RequestParam int b) {

        int start = Math.min(s, customers.size());
        int end = Math.min(start + b, customers.size());

        return customers.subList(start, end);
    }
}