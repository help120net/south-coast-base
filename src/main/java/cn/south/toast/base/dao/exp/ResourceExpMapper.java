package cn.south.toast.base.dao.exp;

import java.util.List;
import java.util.Map;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.south.toast.base.dto.MenuResourceOutDTO;
import cn.south.toast.base.module.Resource;



/**
 * 资源DAO扩展类
 * @author Liang
 *
 */
@Repository
public interface ResourceExpMapper {
	
	/**
	 * 根据用户ID获取资源
	 * @param userId
	 * @return
	 */
	public List<String> listResourceByUserId(String userId);
	
	/**
	 * 根据用户ID有权限的主菜单
	 * @param userId
	 * @return
	 */
	public List<MenuResourceOutDTO> listMenuResource(String userId);
	
	/**
	 * 根据用户ID有权限的按钮
	 * @param userId
	 * @return
	 */
	public List<String> listButtonResource(String userId);
	



}
