package com.command.impl;


import com.command.domain.BankAccount;

public class AccountReceiverImpl implements AccountReceiver{

    private final BankAccount account;

    public AccountReceiverImpl(BankAccount account) {
        this.account = account;
    }

    @Override
    public void withdraw(Double amount) {
        Double value = this.account.getAmount() - amount;
        this.account.setAmount(value);
    }

    @Override
    public void deposit(Double amount) {
        Double value = this.account.getAmount() + amount;
        this.account.setAmount(value);
    }

    @Override
    public void extract() {
        System.out.println(account.getAmount());
    }
}
