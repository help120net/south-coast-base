package cn.south.toast.base.module;

import cn.south.toast.common.mybatis.base.EntityBase;

public class User extends EntityBase {
    /**
     * 用户名
     *
     * @mbggenerated
     */
    private String username;

    /**
     * 中文名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 密码
     *
     * @mbggenerated
     */
    private String password;

    /**
     * 用户手机号码
     *
     * @mbggenerated
     */
    private String mobile;

    /**
     * 用户状态(1 停用 2 正常)
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * 改用户对应的角色
     *
     * @mbggenerated
     */
    private String roleNameStr;

    /**
     * 用户是否第一次登录（1 是 默认为1）
     *
     * @mbggenerated
     */
    private Integer isFirstLogin;

    /**
     * 类型(1管理员，2分成主体，3场馆)
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * 是否被锁
     *
     * @mbggenerated
     */
    private Boolean locked;

    /**
     * 用户名
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户名
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 中文名称
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * 中文名称
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 密码
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 用户手机号码
     *
     * @mbggenerated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 用户手机号码
     *
     * @mbggenerated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 用户状态(1 停用 2 正常)
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 用户状态(1 停用 2 正常)
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 改用户对应的角色
     *
     * @mbggenerated
     */
    public String getRoleNameStr() {
        return roleNameStr;
    }

    /**
     * 改用户对应的角色
     *
     * @mbggenerated
     */
    public void setRoleNameStr(String roleNameStr) {
        this.roleNameStr = roleNameStr;
    }

    /**
     * 用户是否第一次登录（1 是 默认为1）
     *
     * @mbggenerated
     */
    public Integer getIsFirstLogin() {
        return isFirstLogin;
    }

    /**
     * 用户是否第一次登录（1 是 默认为1）
     *
     * @mbggenerated
     */
    public void setIsFirstLogin(Integer isFirstLogin) {
        this.isFirstLogin = isFirstLogin;
    }

    /**
     * 类型(1管理员，2分成主体，3场馆)
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * 类型(1管理员，2分成主体，3场馆)
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 是否被锁
     *
     * @mbggenerated
     */
    public Boolean getLocked() {
        return locked;
    }

    /**
     * 是否被锁
     *
     * @mbggenerated
     */
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }
}