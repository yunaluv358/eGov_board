package com.board.web.mappers;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import com.board.web.domains.Account;


@Repository
public interface TxMapper {
	@Insert("insert into persons (userid, password) "
			+ " values #{userid}, #{password}")
	public void insertUser(Account user);

}