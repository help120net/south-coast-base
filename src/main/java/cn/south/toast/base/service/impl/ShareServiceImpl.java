package cn.south.toast.base.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import cn.south.toast.base.dao.ShareMapper;
import cn.south.toast.base.module.Share;
import cn.south.toast.base.module.ShareExample;
import cn.south.toast.base.service.ShareService;
import cn.south.toast.common.mybatis.base.IBaseMapper;
import cn.south.toast.common.mybatis.base.BaseServiceImpl;

import java.util.List;
import cn.south.toast.common.mybatis.query.Query;
import cn.south.toast.common.mybatis.base.PageParameter;

@Service
@Transactional
public class ShareServiceImpl extends BaseServiceImpl<Share, ShareExample> implements ShareService {

    @Autowired
	private ShareMapper baseMapper;



	@Override
	public IBaseMapper<Share, ShareExample> getBaseMapper() {
		return baseMapper;
	}

	@Override
    public List<Share> query(Query query, PageParameter pageParameter) {
    	return baseMapper.query(query,pageParameter);
    }
}