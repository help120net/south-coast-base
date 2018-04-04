package cn.south.toast.base.service;

import cn.south.toast.base.module.Role;
import cn.south.toast.base.module.RoleExample;
import cn.south.toast.common.mybatis.base.IBaseService;
import cn.south.toast.common.mybatis.base.PageParameter;
import cn.south.toast.common.mybatis.query.Query;
import java.util.List;

public interface RoleService extends IBaseService<Role, RoleExample> {
    List<Role> query(Query query, PageParameter pageParameter);
    
    /**
     * 根据用户Id获取角色名称
     * @param userId
     * @return
     */
	List<String> listRoleByUserId(String userId);
}