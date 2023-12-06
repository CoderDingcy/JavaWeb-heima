package com.itheima.controller;

import com.itheima.pojo.Address;
import com.itheima.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResponseController {

//    @RequestMapping("/hello")
//    public String hello() {
//
//
//        System.out.println("Hello World!!");
//        return "Hello World!!";
//    }
//
//    @RequestMapping("/getAddr")
//    public Address getAddr() {
//        Address addr = new Address();
//        addr.setCity("广东");
//        addr.setCity("深圳");
//
//        return addr;
//    }
//
//    @RequestMapping("/listAddr")
//    public List<Address> listAddr() {
//        List<Address> list=new ArrayList<>();
//
//        Address addr=new Address();
//        addr.setCity("北京");
//        addr.setCity("上海");
//
//        Address addr2=new Address();
//        addr.setCity("西安");
//        addr.setCity("合肥");
//
//        list.add(addr);
//        list.add(addr2);
//
//        return list;
//    }

    @RequestMapping("/hello")
    public Result hello() {


        System.out.println("Hello World!!");
        return Result.success("Hello World!!");
    }

    @RequestMapping("/getAddr")
    public Result getAddr() {
        Address addr = new Address();
        addr.setCity("广东");
        addr.setCity("深圳");

        return Result.success(addr);
    }

    @RequestMapping("/listAddr")
    public Result listAddr() {
        List<Address> list=new ArrayList<>();

        Address addr=new Address();
        addr.setCity("北京");
        addr.setCity("上海");

        Address addr2=new Address();
        addr.setCity("西安");
        addr.setCity("合肥");

        list.add(addr);
        list.add(addr2);

        return Result.success(list);
    }

}
