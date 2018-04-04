package cn.south.toast.base.enums;

import java.util.Objects;

/**
 * Created By User: RXK
 * Date: 2017/10/19
 * Time: 19:27
 * Version: V1.0
 * Description:用户状态枚举
 */
public enum  UserStatusEnum
{
	ACCOUNT_DISTABLE(1,"停用"),
	ACCOUNT_NORMAL(2,"正常");

	private int code ;
	private String msg ;

	 UserStatusEnum(int code, String msg)
	{
		this.code = code;
		this.msg = msg;
	}

	public int getCode(){
	 	return this.code ;
	}
	public String getMsg(){
		return this.msg ;
	}

	public static UserStatusEnum getValue(Integer code){
		if(Objects.nonNull(code)){
			for(UserStatusEnum value : UserStatusEnum.values()){
				if(value.code == code){
					return value ;
				}
			}
		}
		return null ;
	}
}
