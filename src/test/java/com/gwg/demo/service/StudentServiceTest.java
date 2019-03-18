package com.gwg.demo.service;


import com.gwg.demo.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest {

    @Autowired
    DataSource dataSource;

    @Autowired
    StudentService studentService;

    /**
     * 查看当前使用的数据库连接池
     */
    @Test
    public void testDataSource(){

        System.out.println(dataSource.getClass());

        studentService.updateStudent();
    }
}
