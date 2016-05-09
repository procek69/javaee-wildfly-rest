package com.pjatk.uczelnia;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/students")
public class StudentRest {

    @EJB
    private StudentService studentService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getStudents() {
        return studentService.getAllStudent();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Student addStudent(Student student) {
        studentService.addStudent(student);
        return student;
    }

}
