package com.xuecheng.framework.domain.cms.request;

import lombok.Data;

/**
 * @Auther: ZGS
 * @Date: 2018/12/19 23:07
 * @Description:
 */
@Data
public class QueryPageRequest {

    //接受頁面查詢的條件

    //站点id
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
