package com.nigel.HibernateCRUDDemo.dao;

import com.nigel.HibernateCRUDDemo.entity.Instructor;
import com.nigel.HibernateCRUDDemo.entity.InstructorDetail;

public interface AppDAO {
    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);
}
