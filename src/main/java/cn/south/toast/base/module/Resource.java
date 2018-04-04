package cn.south.toast.base.module;

import cn.south.toast.common.mybatis.base.EntityBase;

public class Resource extends EntityBase {
    /**
     * 
     *
     * @mbggenerated
     */
    private String parentId;

    /**
     * 编码
     *
     * @mbggenerated
     */
    private Integer number;

    /**
     * 长编码
     *
     * @mbggenerated
     */
    private String longNumber;

    /**
     * 
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 
     *
     * @mbggenerated
     */
    private String url;

    /**
     * 
     *
     * @mbggenerated
     */
    private String description;

    /**
     * 类型：0菜单项，1功能项
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * 是否显示菜单,0 显示 1 不显示
     *
     * @mbggenerated
     */
    private Integer showMenu;

    /**
     * 是否有子节点0：没有，1：有
     *
     * @mbggenerated
     */
    private Boolean hasFunctionChildren;

    /**
     * 级别
     *
     * @mbggenerated
     */
    private Integer level;

    /**
     * 
     *
     * @mbggenerated
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 
     *
     * @mbggenerated
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 编码
     *
     * @mbggenerated
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 编码
     *
     * @mbggenerated
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 长编码
     *
     * @mbggenerated
     */
    public String getLongNumber() {
        return longNumber;
    }

    /**
     * 长编码
     *
     * @mbggenerated
     */
    public void setLongNumber(String longNumber) {
        this.longNumber = longNumber;
    }

    /**
     * 
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * 
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     *
     * @mbggenerated
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     *
     * @mbggenerated
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 类型：0菜单项，1功能项
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * 类型：0菜单项，1功能项
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 是否显示菜单,0 显示 1 不显示
     *
     * @mbggenerated
     */
    public Integer getShowMenu() {
        return showMenu;
    }

    /**
     * 是否显示菜单,0 显示 1 不显示
     *
     * @mbggenerated
     */
    public void setShowMenu(Integer showMenu) {
        this.showMenu = showMenu;
    }

    /**
     * 是否有子节点0：没有，1：有
     *
     * @mbggenerated
     */
    public Boolean getHasFunctionChildren() {
        return hasFunctionChildren;
    }

    /**
     * 是否有子节点0：没有，1：有
     *
     * @mbggenerated
     */
    public void setHasFunctionChildren(Boolean hasFunctionChildren) {
        this.hasFunctionChildren = hasFunctionChildren;
    }

    /**
     * 级别
     *
     * @mbggenerated
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 级别
     *
     * @mbggenerated
     */
    public void setLevel(Integer level) {
        this.level = level;
    }
}