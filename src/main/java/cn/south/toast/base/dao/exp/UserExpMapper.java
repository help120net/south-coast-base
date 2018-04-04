package cn.south.toast.base.dao.exp;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.south.toast.base.dto.UserInDTO;
import cn.south.toast.base.dto.UserLoginOutDTO;
import cn.south.toast.base.dto.UserTypeInDTO;
import cn.south.toast.base.module.Role;
import cn.south.toast.base.module.User;



/**
 * 用户Dao扩展类
 * @author Liang
 *
 */
@Repository
public interface UserExpMapper {
	
	/**
	 * 获取最大的用户名
	 */
	String getMaxUsername(@Param("param")UserTypeInDTO param); 
	
	/**
	 * 获取用户登录对象
	 * @param username 用户名
	 */
	UserLoginOutDTO getUserLoginOutDTO(String username);
	/**
	 * 查询用户类型
	 * @param userid
	 * @return
	 */
	Integer selectUserTypeByUserId(String userid);

	/**
	 * 根据用户id查询场馆
	 * @param userid
	 * @return
	 */
	String selectGymByUserId(String userid);

	/**
	 * 根据用户iD查询主体
	 * @param userid
	 * @return
	 */
	String selectSubjectByUserId(String userid);

	/**
	 * 根据当前用户的Id查询相关的角色信息
	 * @param dto
	 * @return
	 */
	Role selectRoleMsg(@Param("dto") UserInDTO dto);
	
	/**
	 * 根据用户名或电话获取用户信息
	 */


	String getUserIdByUserNameOrMobile(String usernameOrMobile);

	/**
	 * 根据用户id和密码查看用户是否存在
	 * @param userId
	 * @param password
	 * @return
	 */
	Boolean UserIFExistInUserIdAndPassword(@Param("userId") String userId,@Param("password") String password);

	User getMobile(String usernameOrMobile);
}
