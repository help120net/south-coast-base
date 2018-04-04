package cn.south.toast.base.dto;

import cn.south.toast.common.dto.TreeDTO;

/**
 * 用户菜单资源
 * @author Liang
 *
 */
public class MenuResourceOutDTO extends TreeDTO {
	/** 名称 */
	private String name;
	/** URL */
	private String url;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
