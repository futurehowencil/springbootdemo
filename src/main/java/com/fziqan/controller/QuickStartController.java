package com.fziqan.controller;

import com.fziqan.Student;
import com.fziqan.mapper.UserMapper;
import com.fziqan.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @PackageName:com.fziqan.controller
 * @ClassName:QuickStarController
 * @Description:
 * @author:FziqAn
 * @date 2019/5/27 16:14
 */
@RestController
public class QuickStartController {

    @Autowired
    private Student student;

    @RequestMapping(value = "/")
    public String quickStart() {
        return "SpringBoot访问成功";
    }

    @RequestMapping(value = "/student")
    public Student student() {
        return student;
    }

    @RequestMapping(value = "/index")
    public String stu() {
        return "姓名：" + student.getName() + "，年龄：" + student.getAge();
    }

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/findAll")
    public List<User> findAll() {
        List<User> all = userMapper.findAll();
        return all;
    }
}
