package com.nefu.test01.Controller;


import com.nefu.test01.pojo.Student;
import com.nefu.test01.pojo.User;
import com.nefu.test01.test1.service.UserService;
import com.nefu.test01.test2.service.StudentService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private StudentService studentService;

    //Logger logger = Logger.getLogger(UserService.class);




    @RequestMapping("/test")
    @ResponseBody
    @Transactional   //事务注解
    public Map<String, Object> insertUser() {
        //logger.info("哈哈哈哈哈哈！！！");
       /* User user = new User();
        user.setUserName("zhangsan3");
        user.setPassword("123");
        boolean b = userService.insertUser(user);
*/
        //测试错误
        //int i=1/0;


        Student student = new Student();
        student.setNo(123);
        student.setLass("七班");

        boolean b2 = studentService.insertStudent(student);

        Map<String,Object> map  =new HashMap<>();
        map.put("msg","success!!!");

        return map;
    }


}
