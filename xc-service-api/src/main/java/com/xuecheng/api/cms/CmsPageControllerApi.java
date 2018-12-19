package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;

/**
 * @Auther: ZGS
 * @Date: 2018/12/19 23:13
 * @Description:
 */
public interface CmsPageControllerApi {

    /**
     * 页面查询
     * @param page
     * @param size
     * @param queryPageRequest
     * @return
     */
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);


}
