package com.example.expensemanager.repository;

import com.example.expensemanager.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ExpenseRepository extends MongoRepository<Expense, String> {

    // Get all expenses for a specific user
    List<Expense> findByUserId(String userId);

    // Get all expenses by category
    List<Expense> findByCategory(String category);
}
