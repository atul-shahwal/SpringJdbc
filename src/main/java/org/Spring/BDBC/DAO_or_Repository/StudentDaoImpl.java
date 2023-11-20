package org.Spring.BDBC.DAO_or_Repository;

import org.Entity_or_Model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDaoImpl implements StudentDao{
    private JdbcTemplate jdbcTemplate;
    public int Insert(Student student) {
        //inset query
        String query = "insert into student(id,name,city) values(?,?,?)";
        //fire query
        int result = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
        return result;
    }

    public int Update(Student student) {
        String query = "update student set name=? , city=? where id=?";
        int result = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
        return result;
    }

    public int Remove(Student student) {
        String query = "delete from student where id=?";
        int result = this.jdbcTemplate.update(query,student.getId());
        return result;
    }

    public Student getStudent(int studentID) {
        String query = "select * from student where id=?";
        RowMapper<Student> rowMapper = new RowMapperImplementation();
        return this.jdbcTemplate.queryForObject(query,rowMapper,studentID);
    }

    public List<Student> getAllStudents() {
        String query = "select * from student where id=?";
        RowMapper<Student> rowMapper = new RowMapperImplementation();
        List<Student> students = this.jdbcTemplate.query(query,rowMapper);
        return students;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
