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
	 public void findByEmailAndUserId(String email, String userId);
	 public void findByEmailOrUserId(String email, String userId);
	 public void findByCreatedAtBetween(Date fromDate, Date toDate);
	 public void findByAgeGraterThanEqual(int age);
	 public void findByNameLike(String name);
	 public void findByJobIsNull();
	 public void findByJob(String jobs);
	 public void findByEmailOrderByNameAsc(String email);
}