package cn.south.toast.base.service;

import cn.south.toast.base.module.Share;
import cn.south.toast.base.module.ShareExample;
import cn.south.toast.common.mybatis.base.IBaseService;
import cn.south.toast.common.mybatis.base.PageParameter;
import cn.south.toast.common.mybatis.query.Query;
import java.util.List;

public interface ShareService extends IBaseService<Share, ShareExample> {
    List<Share> query(Query query, PageParameter pageParameter);
}