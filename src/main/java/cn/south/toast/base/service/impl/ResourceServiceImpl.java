package cn.south.toast.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import cn.south.toast.base.dao.ResourceMapper;
import cn.south.toast.base.dao.exp.ResourceExpMapper;
import cn.south.toast.base.module.Resource;
import cn.south.toast.base.module.ResourceExample;
import cn.south.toast.base.service.ResourceService;
import cn.south.toast.common.mybatis.base.IBaseMapper;
import cn.south.toast.common.mybatis.base.BaseServiceImpl;

import java.util.List;
import cn.south.toast.common.mybatis.query.Query;
import cn.south.toast.common.mybatis.base.PageParameter;

@Service
@Transactional
public class ResourceServiceImpl extends BaseServiceImpl<Resource, ResourceExample> implements ResourceService {

	@Autowired
	private ResourceMapper baseMapper;

	@Autowired
	private ResourceExpMapper resourceExpMapper;

	@Override
	public IBaseMapper<Resource, ResourceExample> getBaseMapper() {
		return baseMapper;
	}

	@Override
	public List<Resource> query(Query query, PageParameter pageParameter) {
		return baseMapper.query(query, pageParameter);
	}

	@Override
	public List<String> listResourceByUserId(String userId) {
		return resourceExpMapper.listResourceByUserId(userId);
	}
}