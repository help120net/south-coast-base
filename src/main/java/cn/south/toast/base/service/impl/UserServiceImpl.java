package cn.south.toast.base.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import cn.south.toast.base.dao.UserMapper;
import cn.south.toast.base.dao.exp.ResourceExpMapper;
import cn.south.toast.base.dao.exp.UserExpMapper;
import cn.south.toast.base.dto.MenuResourceOutDTO;
import cn.south.toast.base.dto.UserLoginOutDTO;
import cn.south.toast.base.module.User;
import cn.south.toast.base.module.UserExample;
import cn.south.toast.base.service.UserService;
import cn.south.toast.common.mybatis.base.IBaseMapper;
import cn.south.toast.common.dto.TreeDTO;
import cn.south.toast.common.mybatis.base.BaseServiceImpl;

import java.util.List;
import cn.south.toast.common.mybatis.query.Query;
import cn.south.toast.common.utils.TreeUtils;
import cn.south.toast.common.mybatis.base.PageParameter;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User, UserExample> implements UserService {

    @Autowired
	private UserMapper baseMapper;
    
    @Autowired
    private UserExpMapper userExpMapper;
    @Autowired
    private ResourceExpMapper resourceExpMapper;



	@Override
	public IBaseMapper<User, UserExample> getBaseMapper() {
		return baseMapper;
	}

	@Override
    public List<User> query(Query query, PageParameter pageParameter) {
    	return baseMapper.query(query,pageParameter);
    }
	
	@Override
	public UserLoginOutDTO getUserLoginOutDTO(String username)
	{
		//查询用户登录对象
		UserLoginOutDTO userLoginOutDTO = userExpMapper.getUserLoginOutDTO(username);
		if (userLoginOutDTO == null)
		{
			return null;
		}
		//查询用户有权限的菜单
		List<MenuResourceOutDTO> listMenuResource = resourceExpMapper.listMenuResource(userLoginOutDTO.getId());
		//资源列表转树
		List<TreeDTO> resourceTreeList = TreeUtils.list2TreeList(listMenuResource);
		userLoginOutDTO.setMenuResourceList(resourceTreeList);
		//查询用户有权限的按钮
		List<String> buttonURLList = resourceExpMapper.listButtonResource(userLoginOutDTO.getId());
		userLoginOutDTO.setButtonURLList(buttonURLList);

		return userLoginOutDTO;
	}
}