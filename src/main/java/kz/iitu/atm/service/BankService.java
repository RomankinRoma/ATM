package kz.iitu.atm.service;

import kz.iitu.atm.models.Account;
import kz.iitu.atm.models.Bank;

import java.util.Scanner;


public class BankService {
    Scanner in = new Scanner(System.in);

    Bank bank = new Bank();

    public BankService(Bank bank) {
        this.bank = bank;
    }

    public void withdraw() {
        System.out.println("Input login:");
        String login = in.next();
        System.out.println("Input pin:");
        String pin = in.next();
          for (Account account: bank.getUsers()){
              if (account.getLogin().equals(login) && account.getPin().equals(pin)){
                  System.out.println("Input amount:");
                  Long amount=in.nextLong();
                  account.setBalance(account.getBalance()-amount);
                  System.out.println("Successful! Your balance "+account.getBalance());
              }
          }
    }

    public void topUp() {
        System.out.println("Input login:");
        String login = in.next();
        System.out.println("Input pin:");
        String pin = in.next();
        for (Account account: bank.getUsers()){
            if (account.getLogin().equals(login) && account.getPin().equals(pin)){
                System.out.println("Input amount:");
                Long amount=in.nextLong();
                account.setBalance(account.getBalance()+amount);
                System.out.println("Successful! Your balance "+account.getBalance());
            }
        }
    }

    public void checkBalance() {
        System.out.println("Input login:");
        String login = in.next();
        System.out.println("Input pin:");
        String pin = in.next();
        for (Account account: bank.getUsers()){
            if (account.getLogin().equals(login) && account.getPin().equals(pin)){
                System.out.println("Your balance "+account.getBalance());
            }
        }
    }
}
