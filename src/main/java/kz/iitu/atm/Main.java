package kz.iitu.atm;

import kz.iitu.atm.config.Config;
import kz.iitu.atm.models.Account;
import kz.iitu.atm.models.Bank;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Bank bank=context.getBean("bank",Bank.class);
        List<Account> accountList=context.getBean("accountList",List.class);
        for (Account account:accountList){
            account.setBank(bank);
        }
        System.out.println(accountList);
        System.out.println(bank.toString());
    }
}
