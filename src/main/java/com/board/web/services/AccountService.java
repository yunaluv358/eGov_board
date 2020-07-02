package com.board.web.services;

import java.util.Date;

import org.springframework.stereotype.Component;
import com.board.web.domains.Account;
@Component
public interface AccountService {
	 public void save();
	 public void update();
	 public void findOne();
	 public void findAll();	
	 public void count();
	 public void delete();
	 public Account findByUseridAndPassword(Account account);
	 public void findByEmailOrUserId(String email, String userId);
	 public void findByCreatedAtBetween(Date fromDate, Date toDate);
	 public void findByAgeGraterThanEqual(int age);
	 public void findByNameLike(String name);
	 public void findByAccessCodeIsNull();
	 public void findByGenerLike(String gender);
	 public void findByEmailOrderByNameAsc(String email);
}