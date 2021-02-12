package kz.iitu.atm.controller;

import kz.iitu.atm.models.Account;
import kz.iitu.atm.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BankController {

    @Autowired
    BankService service;

    @GetMapping("/account/all")
    public List<Account> accountList(){
        return service.getAll();
    }
}
