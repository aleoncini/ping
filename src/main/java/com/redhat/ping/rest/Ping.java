package com.redhat.ping.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Path("/ping")
public class Ping {
    @GET
    @Produces("application/json")
    public Response doGet() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String text = date.format(formatter);
        return Response.ok("pong at " + text).build();
    }
}
