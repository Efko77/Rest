package rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

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
}

