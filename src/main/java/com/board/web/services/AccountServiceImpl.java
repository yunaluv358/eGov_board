package com.board.web.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.web.domains.Account;
import com.board.web.mappers.AccountMapper;

@Service
public class AccountServiceImpl implements AccountService{
	private static final Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);
	@Autowired
	AccountMapper personMapper;
	
	public Account findPersonForAccess(Account person) {
		logger.info(person.toString());
		return personMapper.selectUserByIdPw(person);
	}

}