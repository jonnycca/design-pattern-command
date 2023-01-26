package com.command.command.impl;


import com.command.command.AccountCommand;
import com.command.impl.AccountReceiverImpl;

public class WithdrawCommand implements AccountCommand {

    private final Double amount;

    private final AccountReceiverImpl accountReceiverImpl;

    public WithdrawCommand(AccountReceiverImpl accountReceiverImpl, Double amount) {
        this.accountReceiverImpl = accountReceiverImpl;
        this.amount = amount;
    }

    @Override
    public void execute() {
        accountReceiverImpl.withdraw(amount);
    }
}
