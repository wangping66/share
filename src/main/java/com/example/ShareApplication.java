package com.example;

import com.example.wp.share.controller.CustBaseController;
import com.example.wp.share.entity.CustBase;
import com.example.wp.share.repository.CustBaseRepository;
import com.example.wp.share.service.CustBaseServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


/**
 * 动态代理，生成一个CustBaseRepository接口类型的代理对象，是SimpleJpaRepository的代理
 * JpaRepositoryFactor对象，根据给定的接口，创建接口实现类，是SimpleJpaRepository的代理
 * 要求继承Repository接口
 */
@SpringBootApplication
public class ShareApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ShareApplication.class, args);
        CustBaseRepository custBaseRepository = (CustBaseRepository) applicationContext.getBean("custBaseRepository");
        //知道类名查找类:双击Shift;
        //intellij idea如何快速查看当前类中的所有方法 alt+7
        //-------org.springframework.data.jpa.repository.support.SimpleJpaRepository@598f6c93
        //-------class com.sun.proxy.$Proxy98 这个是代理对象 是SimpleJpaRepository的代理
        //动态代理对象
        System.out.println("-------"+custBaseRepository);
        System.out.println("-------"+custBaseRepository.getClass());
        CustBaseController custBaseController = applicationContext.getBean(CustBaseController.class);
        CustBase custBase = custBaseRepository.findCustBaseByCustId("1");
        System.out.println(custBase);





    }

}
