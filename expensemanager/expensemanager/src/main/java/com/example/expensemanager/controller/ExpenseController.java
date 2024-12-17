package com.example.expensemanager.controller;

import com.example.expensemanager.model.Expense;
import com.example.expensemanager.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    // Endpoint to add an expense
    @PostMapping("/add")
    public Expense addExpense(@RequestBody Expense expense) {
        return expenseService.addExpense(expense);
    }

    // Endpoint to get all expenses for a user
    @GetMapping("/user/{userId}")
    public List<Expense> getExpensesByUser(@PathVariable String userId) {
        return expenseService.getExpensesByUserId(userId);
    }

    // Endpoint to get expenses by category
    @GetMapping("/category/{category}")
    public List<Expense> getExpensesByCategory(@PathVariable String category) {
        return expenseService.getExpensesByCategory(category);
    }
}
