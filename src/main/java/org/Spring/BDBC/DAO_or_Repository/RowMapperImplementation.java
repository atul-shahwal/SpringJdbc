package org.Spring.BDBC.DAO_or_Repository;

import org.Entity_or_Model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImplementation implements RowMapper {
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt(1));//As in our table first column hold the student id;
        student.setName(rs.getString(2));//As in our table Second column hold the student Name.
        student.setCity(rs.getString(3));//As in our table third column hold the Student City.
        return student;
    }
}
