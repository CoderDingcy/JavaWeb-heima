package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//不推荐@ComponentScan({"dao","com.itheima"}) //覆盖掉默认扫描的操作
@SpringBootApplication //scan注解扫描范围默认为启动类当前包及其子包
public class SpringbootWebReqRespApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebReqRespApplication.class, args);
    }

}
