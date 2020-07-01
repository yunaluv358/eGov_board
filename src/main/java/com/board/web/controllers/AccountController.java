package com.board.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.board.web.domains.Account;
import com.board.web.enums.Messenger;
import com.board.web.services.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	AccountService accountService;
	
	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	@PostMapping("/users")
	public Messenger join(@RequestBody Account account) {
		System.out.println("넘어온 회원 정보 "+account.toString());
		return Messenger.SUCCESS; 
	}

}
