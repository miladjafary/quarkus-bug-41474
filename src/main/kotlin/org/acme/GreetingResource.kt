package org.acme

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import java.awt.image.SampleModel

@Path("/hello")
class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(sampleRequest: SampleRequest): String {
        return "Hello RESTEasy ${sampleRequest.userAgent}"

    }
}