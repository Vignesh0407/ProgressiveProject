package com.wecp.progressive.service;


import com.wecp.progressive.entity.Accounts;
import com.wecp.progressive.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class AccountServiceImplJpa implements  AccountService{

    private AccountRepository accountRepository;
    @Autowired
    public AccountServiceImplJpa(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Accounts> getAllAccounts() throws SQLException {
        return null;
    }

    @Override
    public List<Accounts> getAccountsByUser(int userId) throws SQLException {
        return null;
    }

    @Override
    public Accounts getAccountById(int accountId) throws SQLException {
        return null;
    }

    @Override
    public int addAccount(Accounts accounts) throws SQLException {
        return 0;
    }

    @Override
    public void updateAccount(Accounts accounts) throws SQLException {

    }

    @Override
    public void deleteAccount(int accountId) throws SQLException {

    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
        return null;
    }

    @Override
    public List<Accounts> getAllAccountsFromArrayList() {
        return null;
    }

    @Override
    public List<Accounts> addAccountToArrayList(Accounts accounts) {
        return null;
    }

    @Override
    public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
        return null;
    }

    @Override
    public void emptyArrayList() {

    }
}