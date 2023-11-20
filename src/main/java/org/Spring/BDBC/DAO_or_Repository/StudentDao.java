package org.Spring.BDBC.DAO_or_Repository;

import org.Entity_or_Model.Student;

import java.util.List;

public interface StudentDao {
    public int Insert(Student student);

    public int Update(Student student);
    public  int Remove(Student student);

    public Student getStudent(int studentID);

    public List<Student> getAllStudents();




}
