package com.itheima.controller;

import com.itheima.pojo.Emp;
import com.itheima.pojo.Result;
import com.itheima.service.EmpService;
import com.itheima.service.impl.EmpServiceA;
import com.itheima.utils.XmlParserUtils;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    //@Qualifier("empServiceB")//代表注入的是A
    //@Autowired //运行时 IOC容器自动提供该类型bean对象，并赋值给该对象--依赖注入
    //private EmpService empService;
    @Resource(name = "empServiceA")
    private EmpService empService;

    @RequestMapping("/listEmp")
    public Result list() {
        //调用service 获取数据
        List<Emp> empList=empService.listEmp();
        //响应数据
        return Result.success(empList);
    }


//    @RequestMapping("/listEmp")
//    public Result list() {
//        //
//        //加载并解析emp.xml文件
//        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
//        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
//
//        //对数据进行转换处理
//        empList.stream().forEach(
//                emp -> {
//                    //处理gender 1：男 2：女
//                    String gender = emp.getGender();
//                    if (gender.equals("1")) {
//                        emp.setGender("男");
//                    } else if (gender.equals("2")) {
//                        emp.setGender("女");
//                    }
//
//                    //处理job 1：讲师 2：班主任 3：就业指导
//                    String job = emp.getJob();
//                    if (job.equals("1")) {
//                        emp.setJob("讲师");
//                    } else if (job.equals("2")) {
//                        emp.setJob("班主任");
//                    } else if (job.equals("3")) {
//                        emp.setJob("就业指导");
//                    }
//                }
//        );
//        //响应数据
//        return Result.success(empList);
//    }
}
