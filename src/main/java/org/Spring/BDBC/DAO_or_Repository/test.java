package org.Spring.BDBC.DAO_or_Repository;

import org.Entity_or_Model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class test {
    public static void main(String[] args) {
        System.out.println("spring jdbc.................");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/Config.xml");
        StudentDao studentDao = (StudentDao) applicationContext.getBean("StudentDao");
        Student student = new Student(105,"gaurav","delhi");
        int result = studentDao.Insert(student);
        System.out.println(result);



    }
}
