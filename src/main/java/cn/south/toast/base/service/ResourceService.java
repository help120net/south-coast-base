package cn.south.toast.base.service;

import cn.south.toast.base.module.Resource;
import cn.south.toast.base.module.ResourceExample;
import cn.south.toast.common.mybatis.base.IBaseService;
import cn.south.toast.common.mybatis.base.PageParameter;
import cn.south.toast.common.mybatis.query.Query;
import java.util.List;

public interface ResourceService extends IBaseService<Resource, ResourceExample> {
    List<Resource> query(Query query, PageParameter pageParameter);
    
    /**
     * 根据用户ID获取资源
     * @param userId 用户ID
     * @return
     */
    List<String> listResourceByUserId(String userId);
}