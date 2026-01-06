package com.example.head03oop.ex04.OCP;

public class PaymentProcessor {
    public void pay(Payment payment, double amount) {
        payment.pay(amount);
    }
}