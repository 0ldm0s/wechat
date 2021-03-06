package com.cdeledu.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.cdeledu.common.base.BaseDao;

@Repository
public class BaseDaoSupport<T> implements BaseDao<T> {

	@Resource(name = "sqlSessionTemplate")
	private SqlSessionTemplate sqlSessionTemplate;

	public Integer insert(String statement, Object parameter) throws Exception {
		return sqlSessionTemplate.insert(statement, parameter);
	}

	public Integer delete(String statement, Object parameter) throws Exception {
		return sqlSessionTemplate.delete(statement, parameter);
	}

	public Integer update(String statement, Object parameter) throws Exception {
		return sqlSessionTemplate.update(statement, parameter);
	}

	public Object findOneForJdbcParam(String statement, Object parameter) throws Exception {
		return sqlSessionTemplate.selectOne(statement, parameter);
	}

	public Object findListForJdbcParam(String statement, Object parameter) throws Exception {
		return sqlSessionTemplate.selectList(statement, parameter);
	}

	public Integer getCountForJdbcParam(String statement, Object parameter) throws Exception {
		return (Integer) sqlSessionTemplate.selectOne(statement, parameter);
	}

	public Object findForMap(String statement, Object parameter, String key) throws Exception {
		return sqlSessionTemplate.selectMap(statement, parameter, key);
	}
}
