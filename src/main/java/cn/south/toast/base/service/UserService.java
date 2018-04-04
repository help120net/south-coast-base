package cn.south.toast.base.service;

import cn.south.toast.base.dto.UserLoginOutDTO;
import cn.south.toast.base.module.User;
import cn.south.toast.base.module.UserExample;
import cn.south.toast.common.mybatis.base.IBaseService;
import cn.south.toast.common.mybatis.base.PageParameter;
import cn.south.toast.common.mybatis.query.Query;
import java.util.List;

public interface UserService extends IBaseService<User, UserExample> {
    List<User> query(Query query, PageParameter pageParameter);
    
	/**
	 * 获取用户登录信息
	 * @return 用户登录信息
	 */
	UserLoginOutDTO getUserLoginOutDTO(String username);
}