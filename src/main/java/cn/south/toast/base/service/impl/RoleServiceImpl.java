package cn.south.toast.base.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import cn.south.toast.base.dao.RoleMapper;
import cn.south.toast.base.dao.exp.RoleExpMapper;
import cn.south.toast.base.module.Role;
import cn.south.toast.base.module.RoleExample;
import cn.south.toast.base.service.RoleService;
import cn.south.toast.common.mybatis.base.IBaseMapper;
import cn.south.toast.common.mybatis.base.BaseServiceImpl;

import java.util.List;
import cn.south.toast.common.mybatis.query.Query;
import cn.south.toast.common.mybatis.base.PageParameter;

@Service
@Transactional
public class RoleServiceImpl extends BaseServiceImpl<Role, RoleExample> implements RoleService {

    @Autowired
	private RoleMapper baseMapper;
    
    @Autowired
	private RoleExpMapper roleExpMapper;



	@Override
	public IBaseMapper<Role, RoleExample> getBaseMapper() {
		return baseMapper;
	}

	@Override
    public List<Role> query(Query query, PageParameter pageParameter) {
    	return baseMapper.query(query,pageParameter);
    }
	
	@Override
	public List<String> listRoleByUserId(String userId)
	{
		return roleExpMapper.listRoleByUserId(userId);
	}
}