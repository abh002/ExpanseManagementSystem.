package com.example.expensemanager.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "expenses") // Collection in MongoDB
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Expense {

    @Id
    private String id;
    private String userId; // Link expense to a specific user
    private String category; // Category of the expense (e.g., "Food", "Transport")
    private double amount; // Amount spent
    private String description; // Description of the expense
    private String date; // Date of the expense
}
