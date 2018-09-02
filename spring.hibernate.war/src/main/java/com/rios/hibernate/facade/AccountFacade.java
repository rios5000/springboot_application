package com.rios.hibernate.facade;



import org.springframework.stereotype.Repository;

import com.rios.hibernate.entity.Account;

@Repository
public class AccountFacade extends AbstractFacade<Account> {

    public AccountFacade() {
        super(Account.class);
    }

}
