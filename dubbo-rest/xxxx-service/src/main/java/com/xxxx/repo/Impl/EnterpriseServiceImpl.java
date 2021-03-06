package com.xxxx.repo.Impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxxx.mybatis.IDao.EnterpriseMapper;
import com.xxxx.mybatis.domain.Enterprise;
import com.xxxx.repo.IEnterpriseService;


@Service("enterpriseService")
public class EnterpriseServiceImpl implements IEnterpriseService{
	Logger  logger=Logger.getLogger(EnterpriseServiceImpl.class); 
	@Resource
	private  EnterpriseMapper enterpriseMapper;
	
	//根据id查询
	@Override
	public Enterprise getEnterpriseById(int enterpriseId) {
		return enterpriseMapper.selectByPrimaryKey(enterpriseId);
	}


	@Override
	public void insertEnterprise(Enterprise enterprise) {
		// TODO Auto-generated method stub
		enterpriseMapper.insert(enterprise);
	}


	@Override
	public void deleteEnterprise(int enterpriseId) {
		enterpriseMapper.deleteByPrimaryKey(enterpriseId);
	}

}
