package com.kowait.hello.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 * Hello resources.
 *
 * @author 082010
 * @version 1.0.0
 * @since 1.0.0
 */
@Path("hello")
public class HelloResource {

    @GET
    public Response ping() {
        return Response
                .ok("Hello Jakarta EE")
                .build();
    }
}
