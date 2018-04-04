package cn.south.toast.base.dao.exp;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * 角色Dao扩展类
 * @author Liang
 *
 */
@Repository
public interface RoleExpMapper {
	
	/**
	 * 根据用户ID获取角色
	 * @param userId
	 * @return
	 */
	public List<String> listRoleByUserId(String userId);


}
