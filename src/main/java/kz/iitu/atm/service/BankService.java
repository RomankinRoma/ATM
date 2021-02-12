package kz.iitu.atm.service;

import kz.iitu.atm.models.Account;
import kz.iitu.atm.models.Bank;
import kz.iitu.atm.repository.AccounRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class BankService {

    @Autowired
    AccounRepository accounRepository;

    public List<Account> getAll(){
        return accounRepository.findAll();
    }

    public List<Account> getAllByBalance(Long bal){
        return accounRepository.getAllByBalance(bal);
    }
}
