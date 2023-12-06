package com.itheima.service.impl;

import com.itheima.dao.EmpDao;
import com.itheima.pojo.Emp;
import com.itheima.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

//@Primary//优先级
@Component //意味着将当前类交给IOC容器管理 成为IOC容器的bean
public class EmpServiceA implements EmpService {

    @Autowired //运行时 IOC容器自动提供该类型bean对象，并赋值给该对象--依赖注入
    private EmpDao empDao;

    @Override
    public List<Emp> listEmp() {
        //调用dao 获取数据
        List<Emp> empList = empDao.listEmp();

        //对数据进行处理
        empList.stream().forEach(
                emp -> {
                    //处理gender 1：男 2：女
                    String gender = emp.getGender();
                    if (gender.equals("1")) {
                        emp.setGender("男");
                    } else if (gender.equals("2")) {
                        emp.setGender("女");
                    }

                    //处理job 1：讲师 2：班主任 3：就业指导
                    String job = emp.getJob();
                    if (job.equals("1")) {
                        emp.setJob("讲师");
                    } else if (job.equals("2")) {
                        emp.setJob("班主任");
                    } else if (job.equals("3")) {
                        emp.setJob("就业指导");
                    }
                }
        );
        return empList;
    }
}
