package com.board.web.services;

import java.util.Date;

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
	AccountMapper accountMapper;
	/* (non-Javadoc)
	 * @see com.board.web.services.AccountService#save()
	 */
	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.board.web.services.AccountService#update()
	 */
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.board.web.services.AccountService#findOne()
	 */
	@Override
	public void findOne() {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.board.web.services.AccountService#findAll()
	 */
	@Override
	public void findAll() {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.board.web.services.AccountService#count()
	 */
	@Override
	public void count() {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.board.web.services.AccountService#delete()
	 */
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.board.web.services.AccountService#findByEmailAndUserId(java.lang.String, java.lang.String)
	 */
	@Override
	public void findByEmailAndUserId(String email, String userId) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.board.web.services.AccountService#findByEmailOrUserId(java.lang.String, java.lang.String)
	 */
	@Override
	public void findByEmailOrUserId(String email, String userId) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.board.web.services.AccountService#findByCreatedAtBetween(java.util.Date, java.util.Date)
	 */
	@Override
	public void findByCreatedAtBetween(Date fromDate, Date toDate) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.board.web.services.AccountService#findByAgeGraterThanEqual(int)
	 */
	@Override
	public void findByAgeGraterThanEqual(int age) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.board.web.services.AccountService#findByNameLike(java.lang.String)
	 */
	@Override
	public void findByNameLike(String name) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.board.web.services.AccountService#findByAccessCodeIsNull()
	 */
	@Override
	public void findByAccessCodeIsNull() {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.board.web.services.AccountService#findByGenerLike(java.lang.String)
	 */
	@Override
	public void findByGenerLike(String gender) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.board.web.services.AccountService#findByEmailOrderByNameAsc(java.lang.String)
	 */
	@Override
	public void findByEmailOrderByNameAsc(String email) {
		// TODO Auto-generated method stub
		
	}
}