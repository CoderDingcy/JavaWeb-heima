package com.itheima.controller;

import com.itheima.pojo.User;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * 测试请求参数接收
 */
@RestController
public class RequestController {

    //原始方式

//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request) {
//        //获取请求参数
//
//        String name = request.getParameter("name");
//        String ageStr = request.getParameter("age");
//
//        int age = Integer.parseInt(ageStr);
//
//        System.out.println(name + ":" + age);
//        return "ok!!!";
//    }


    //springboot方式
//    @RequestMapping("/simpleParam")
//    //需要保持请求的参数名与函数形参名保持一致
//    public String simpleParam(String name,Integer age) {
//        //获取请求参数
//
//        System.out.println(name + ":" + age);
//        return "ok!!!";
//    }

    @RequestMapping("/simpleParam")
    //需要保持请求的参数名与函数形参名保持一致
    public String simpleParam(@RequestParam(name = "name", required = false) String username, Integer age) {
        //使用RequestParam注解代表必须要传递这个参数 如果不传递则会报错 因为参数required默认设置为true
        //如果修改required为false就不是必须传递了

        //获取请求参数
        System.out.println(username + ":" + age);
        return "ok!!!";
    }

    @RequestMapping("/simplePojo")
    public String simplePojo(User user) {

        System.out.println(user.getName() + ":" + user.getAge());

        return "ok";
    }

    @RequestMapping("/complexPojo")
    public String complexPojo(User user) {

        System.out.println(user.getName() + " " + user.getAge() + " " + user.getAddress().getCity() + " " + user.getAddress().getProvince());

        return "ok";
    }


    //数组参数
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby) {

        System.out.println(Arrays.toString(hobby));

        return "OK!";
    }


    //集合参数
    @RequestMapping("/listParam")
    public String arrayParam(@RequestParam List<String> hobby) {

        System.out.println(hobby);

        return "OK!";
    }

    //日期参数
    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDate updateTime) {
        System.out.println(updateTime);
        return "OK!!!!!!!!!!";
    }

    //json参数
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user) {
        System.out.println(user.getName());
        return "OK!!!!!!!!!!";
    }

    //路径参数
    @RequestMapping("/path/{id}/{name}")
    public String pathParam(@PathVariable Integer id,@PathVariable String name) {
        System.out.println(id+""+name);
        return "OK!!!!!!!!!!";
    }
}
