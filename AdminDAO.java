package com.canary.api.dao;

import com.canary.api.mapper.AdminMapper;

public class AdminDAO extends BaseDAO {

	private static AdminDAO instance = new AdminDAO();

	public static AdminDAO getInstance() {
		return instance;
	}

	@Override
	protected AdminMapper getMapper() {
		AdminMapper mapper = getSessionObject().getMapper(AdminMapper.class);
		return mapper;
	}

}
