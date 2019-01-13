package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.domain.cms.response.CmsPageResult;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.ResponseResult;
import io.swagger.annotations.ApiOperation;

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

    //新增页面
    @ApiOperation("新增页面")
    public CmsPageResult add(CmsPage cmsPage);

    //根据页面id查询页面信息
    @ApiOperation("根据页面id查询页面信息")
    public CmsPage findById(String id);
    //修改页面
    @ApiOperation("修改页面")
    public CmsPageResult edit(String id, CmsPage cmsPage);

    //删除页面
    @ApiOperation("删除页面")
    public ResponseResult delete(String id);


}
