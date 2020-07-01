package com.board.web.mappers;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.board.web.domains.Account;

@Repository
public interface AccountMapper {
	public void insertUser(Account user);
	public Account selectUserByIdPw(Account user);
	public int existId(String userid);
	public int countUsers();
	public void createDB(HashMap<String, String> paramMap);
	public void createUser(HashMap<String, String> paramMap);
	public void dropUser(HashMap<String, String> paramMap);
	public void truncateUser(HashMap<String, String> paramMap);
}