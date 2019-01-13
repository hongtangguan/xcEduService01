package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;





/**
 * @Auther: ZGS
 * @Date: 2018/12/20 00:16
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsPageRepositoryTest {

    @Autowired
    private CmsPageRepository cmsPageRepository;

    @Test //测试OK
    public void testFindAll(){
        List<CmsPage> all = cmsPageRepository.findAll();
        System.out.println(all);
    }


    //分页查 OK
    @Test
    public void testFindPage(){
        int page = 0;
        int size = 10;
        Pageable pageable = PageRequest.of(page,size);

        Page<CmsPage> all = cmsPageRepository.findAll(pageable);System.out.println(all);
    }


    @Test
    public void testUpdate(){
        Optional<CmsPage> optional = cmsPageRepository.findById("5abefd525b05aa293098fca6");
        if (optional.isPresent()) {
            CmsPage cmsPage = optional.get();
            //设置要修改的值
            cmsPage.setPageAliase("test0001");
            //修改
            CmsPage save = cmsPageRepository.save(cmsPage);
        }
    }

    @Test
    public void testFindAllByConditions(){

        //分页参数
        int page = 1;
        int size = 10;
        Pageable pageable = PageRequest.of(page, size);

        //定义Example
        CmsPage cmsPage = new CmsPage();
        //cmsPage.setSiteId("5a751fab6abb5044e0d19ea1");
        //cmsPage.setTemplateId("5aec5dd70e661808240ab7a6");
        cmsPage.setPageAliase("轮播图");
        //条件匹配器
        ExampleMatcher exampleMatcher = ExampleMatcher.matching();

        exampleMatcher = exampleMatcher.withMatcher("pageAliase",ExampleMatcher.GenericPropertyMatchers.contains());

        Example<CmsPage> example = Example.of(cmsPage,exampleMatcher);
        Page<CmsPage> all = cmsPageRepository.findAll(example, pageable);
        List<CmsPage> content = all.getContent();
        System.out.println(content.size());
        System.out.println(content);


    }












}
