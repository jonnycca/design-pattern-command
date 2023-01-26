package com.command.command.impl;


import com.command.command.AccountCommand;
import com.command.impl.AccountReceiverImpl;

public class ExtractCommand implements AccountCommand {

    private final AccountReceiverImpl accountReceiverImpl;

    public ExtractCommand(AccountReceiverImpl accountReceiverImpl) {
        this.accountReceiverImpl = accountReceiverImpl;
    }

    @Override
    public void execute() {
        accountReceiverImpl.extract();
    }
}
