package cn.south.toast.base.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import cn.south.toast.common.dto.TreeDTO;

/**
 * <li>用户信息<br>
 * 用户信息以及用户的主菜单权限项
 * 
 * @author huangbh
 *
 */
public class UserLoginOutDTO {
	/** id */
	private String id;
	/** 用户名 */
	private String username;
	/** 中文名 */
	private String name;
	/** 用户电话 */
	private String mobile;
	/** 密码 */
	@JsonIgnore
	private String password;
	/** 状态 */
	private Integer status;
	/** 是否锁定 */
	private Boolean locked;
	/** 用户类型 */
	private Integer userType;
	/** 按钮URLList */
	private List<String> buttonURLList;
	/** 菜单资源 */
	private List<TreeDTO> menuResourceList;

	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public List<String> getButtonURLList() {
		return buttonURLList;
	}

	public void setButtonURLList(List<String> buttonURLList) {
		this.buttonURLList = buttonURLList;
	}

	public List<TreeDTO> getMenuResourceList() {
		return menuResourceList;
	}

	public void setMenuResourceList(List<TreeDTO> menuResourceList) {
		this.menuResourceList = menuResourceList;
	}

}
