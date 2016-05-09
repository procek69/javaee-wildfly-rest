package com.pjatk.uczelnia;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hello")
public class Hello {

    @GET
    public String helloWorld() {
        return "Hello, world!";
    }

    @GET
    @Path("/{name}")
    public String helloYou(@PathParam("name") String name) {
        return "Hello, " + name + "!";
    }

}
