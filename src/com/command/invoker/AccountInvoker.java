package com.command.invoker;


import com.command.command.AccountCommand;

public class AccountInvoker {

    public void executeCommand(AccountCommand accountCommand){
        accountCommand.execute();
    }
}
