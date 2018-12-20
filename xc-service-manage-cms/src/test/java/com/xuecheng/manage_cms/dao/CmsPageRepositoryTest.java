package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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














}
