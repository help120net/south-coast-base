package cn.south.toast.base.module;

import cn.south.toast.common.mybatis.base.EntityBase;

public class Role extends EntityBase {
    /**
     * 角色名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 
     *
     * @mbggenerated
     */
    private String description;

    /**
     * 角色名称
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * 角色名称
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
}