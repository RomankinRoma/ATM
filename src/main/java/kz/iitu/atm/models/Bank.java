package kz.iitu.atm.models;

import lombok.Data;

import java.util.List;

@Data
public class Bank {
    private Long id;

    private String name;

    private List<Account> users;
}
