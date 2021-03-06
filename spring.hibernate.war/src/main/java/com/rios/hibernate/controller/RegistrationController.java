package com.rios.hibernate.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rios.hibernate.entity.Account;
import com.rios.hibernate.facade.AccountFacade;
import com.rios.hibernate.form.RegistrationForm;

import java.util.List;
import java.util.Map;

@Controller
public class RegistrationController {

    @Autowired
    private AccountFacade accountFacade;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String showMainView() {
        return "index";
    }

    @ModelAttribute("index")
    public RegistrationForm getRegistrationForm() {
        return new RegistrationForm();
    }

    @Transactional
    @RequestMapping(value = "index", method = RequestMethod.POST)
    public String processRegisterUser(@ModelAttribute("index") RegistrationForm form) {

        Account account = new Account();
        account.setName(form.getName());
        account.setEmail(form.getEmail());
        account.setUsername(form.getUsername());
        account.setPassword(form.getPassword());

        accountFacade.create(account);

        return "index";
    }

    @Transactional
    @RequestMapping(value = "index/show-users", method = RequestMethod.GET)
    public String showAllUsers(Map<String, Object> model) {
        List<Account> accounts = accountFacade.findAll();
        model.put("accounts", accounts);
        return "index";
    }

}