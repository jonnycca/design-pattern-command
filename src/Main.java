import com.command.command.impl.DepositCommand;
import com.command.command.impl.ExtractCommand;
import com.command.command.impl.WithdrawCommand;
import com.command.domain.BankAccount;
import com.command.impl.AccountReceiverImpl;
import com.command.invoker.AccountInvoker;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        BankAccount account = new BankAccount(0.0);

        AccountInvoker accountInvoker = new AccountInvoker();

        accountInvoker.executeCommand(new DepositCommand(new AccountReceiverImpl(account), 10.0));

        accountInvoker.executeCommand(new WithdrawCommand(new AccountReceiverImpl(account), 5.0));

        accountInvoker.executeCommand(new ExtractCommand(new AccountReceiverImpl(account)));
    }
}