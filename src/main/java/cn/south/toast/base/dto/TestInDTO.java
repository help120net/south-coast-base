package cn.south.toast.base.dto;

import cn.south.toast.common.dto.PageInDTO;

/**
 * 测试输入dto
 * 
 * @author huangbh
 *
 */
public class TestInDTO extends  PageInDTO{

	private String id;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
