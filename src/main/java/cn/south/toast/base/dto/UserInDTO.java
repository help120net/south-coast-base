package cn.south.toast.base.dto;



import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import cn.south.toast.common.dto.PageInDTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created By User: RXK
 * Date: 2017/9/6
 * Time: 18:19
 * Version: V1.0
 * Description:用于后台权限管理-用户信息的入参对象
 */
public class UserInDTO extends PageInDTO{

	public interface Locked{}

	public interface ChangeStatus{}

	public interface Distrebute{}

	/**
	 * 用户id
	 */
	
	private String id;

	private List<String> roleId = new ArrayList<String>();
	/**
	 * 用户名账号
	 *唯一
	 * 字母+数字 20位以内
	 * @mbggenerated
	 */

	private String username;

	/**
	 * 密码
	 *字母+数字 20位以内
	 * @mbggenerated
	 */

	private String password;

	/**
	 * 用户显示名称
	 */

	private String name;

	/**
	 * 用户手机号码
	 *唯一
	 * @mbggenerated
	 */

	private String mobile;

	/**
	 * 用户状态(1 停用 2 正常)
	 *
	 * @mbggenerated
	 */
	@NotNull(groups = {ChangeStatus.class})
	private Integer status;

	private String roleIds ;

	/**
	 * 改用户对应的角色
	 *
	 * @mbggenerated
	 */
	private String roleNameStr;

	/**
	 * 是否被锁
	 *
	 * @mbggenerated
	 */
	private Integer locked;

	/**
	 * 0 没有删除 1 删除
	 */
	@Null
	private Integer deleteFlag;
	/**
	 * 用户创建时间
	 */
	private Date createTime;
	/**
	 * 创建人
	 */
	private String createBy;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 更新人
	 */
	private String updateBy;

	/**
	 * 开始时间
	 */
	private Date startTime;

	/**
	 * 结束时间
	 */
	private Date endTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getLocked() {
		return locked;
	}

	public void setLocked(Integer locked) {
		this.locked = locked;
	}

	public Integer getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getRoleId()
	{
		return roleId;
	}

	public void setRoleId(List<String> roleId)
	{
		this.roleId = roleId;
	}

	public String getMobile()
	{
		return mobile;
	}

	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}

	public Integer getStatus()
	{
		return status;
	}

	public void setStatus(Integer status)
	{
		this.status = status;
	}

	public String getRoleNameStr()
	{
		return roleNameStr;
	}

	public void setRoleNameStr(String roleNameStr)
	{
		this.roleNameStr = roleNameStr;
	}

	public String getRoleIds()
	{
		return roleIds;
	}

	public void setRoleIds(String roleIds)
	{
		this.roleIds = roleIds;
	}
}
