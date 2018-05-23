package rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/myRest")

public class MyFirstRest {

    //localhost:8080/rest/myRest
    @GET
    public String sayHi() {
        return "Labukas";
    }

    //localhost:8080/rest/myRest/Tundra
    @GET

    @Path("/{name}") //Butinas path nes kitaip neras adreso
    public String SayNew(@PathParam("name") String name) {
        return "Labukas " + name;
    }

    @POST
    @Path("/{name}")
    public String sayNo(@PathParam("name") String name) {
        return "Visai neidomu " + name;
    }

    @POST
    @Path("/{id}/{surname}")
    public String sayTwo(@PathParam("id") int id, @PathParam("surname") String surname) {
        return surname + " " + id;
    }

    @POST
    @Path("/saveAndGet")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Student saveAndGet(Student student) {

        student.setName(student.getName() + "_test");
        student.setSurname(student.getSurname() + "_test");

        return student;
    }

    @GET
    @Path("/students")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getStudents (){


        List<Student> students = new ArrayList<>();

        students.add(new Student(12, "Evaldas", "Grybauskas", "5422354", "eagsjs@dkdk.com"));
        students.add(new Student(1, "Matas", "Jonaitis", "5427854", "eijjs@dkdk.com"));
        students.add(new Student(7, "Valdas", "Otis", "5427896354", "eagppsjs@dkdk.com"));

        return students;
    }

}

