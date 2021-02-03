package kz.iitu.atm;

import kz.iitu.atm.models.Bank;
import kz.iitu.atm.service.BankService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class AtmApplication {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        BankService service = new BankService((Bank) context.getBean("bank"));
        while (true) {

            System.out.println();
            System.out.println("Welcome!");
            System.out.println();

            System.out.println("1.Withdraw");
            System.out.println("2.Check Balance");
            System.out.println("3.Top Up");
            System.out.println("0.Exit");

            Integer chose = in.nextInt();

            switch (chose) {
                case 1:
                    service.withdraw();
                    break;
                case 2:
                    service.checkBalance();
                    break;
                case 3:
                    service.topUp();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Incorrect chose!");
                    break;

            }
        }
    }

}
