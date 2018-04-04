package cn.south.toast.base.module;


import cn.south.toast.common.mybatis.query.Property;


public class User_{

    public static final Property id =new Property("_User.id");

    public static final Property username =new Property("_User.username");

    public static final Property password =new Property("_User.password");

    public static final Property locked =new Property("_User.is_locked");

    public static final Property type =new Property("_User.type");

    public static final Property deleteFlag =new Property("_User.delete_flag");

    public static final Property createTime =new Property("_User.create_time");

    public static final Property createBy =new Property("_User.create_by");

    public static final Property updateTime =new Property("_User.update_time");

    public static final Property updateBy =new Property("_User.update_by");


}