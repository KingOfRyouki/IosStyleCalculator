package com.example.ios_style_calculator.model.operation;

public class Sub implements Operation {
    @Override
    public double getResult(double num_1, double num_2) { return num_1 - num_2; }
}