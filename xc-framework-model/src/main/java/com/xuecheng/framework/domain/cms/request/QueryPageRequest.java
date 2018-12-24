package com.xuecheng.framework.domain.cms.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Auther: ZGS
 * @Date: 2018/12/19 23:07
 * @Description:
 */
@Data
@ApiModel("请求参数封装")
public class QueryPageRequest {

    //接受頁面查詢的條件

    //站点id
    @ApiModelProperty("站点id")
    private String siteId;

    //页面id
    private String pageId;

    //页面名称
    private String pageName;

    //别名
    private String pageAliase;

    //模板id
    private String templateId;



}
