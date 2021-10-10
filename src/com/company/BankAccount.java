package com.company;

public class BankAccount {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount = amount + sum;
        System.out.println("Вы сделали депозит в размере: " + sum + " $");
        System.out.println("Ваш текущий баланс: " + amount + " $");
    }

    public void withDraw(int sum) throws LimitException {
        amount = amount - sum;
        System.out.println("Вы сняли " + sum + " $ с вашего баланса");
        System.out.println("Ваш текущий баланс: " + amount + " $");
        if (amount < sum) {
            throw new LimitException("Недостаточно средств", amount);
        }
    }
}
