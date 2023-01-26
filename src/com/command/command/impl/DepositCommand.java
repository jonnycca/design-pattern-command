package com.command.command.impl;


import com.command.command.AccountCommand;
import com.command.impl.AccountReceiverImpl;

public class DepositCommand implements AccountCommand {

    private final Double amount;

    private final AccountReceiverImpl accountReceiverImpl;

    public DepositCommand(AccountReceiverImpl accountReceiverImpl, Double amount) {
        this.accountReceiverImpl = accountReceiverImpl;
        this.amount = amount;
    }


    @Override
    public void execute() {
        accountReceiverImpl.deposit(this.amount);
    }
}
