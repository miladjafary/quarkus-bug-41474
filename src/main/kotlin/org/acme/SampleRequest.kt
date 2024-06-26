package org.acme

import jakarta.ws.rs.HeaderParam
import jakarta.ws.rs.PathParam
import jakarta.ws.rs.core.HttpHeaders

class SampleRequest {
    // Getters and Setters
    @PathParam("name")
    var name: String? = null

    @HeaderParam("Locale")
    var locale: String? = null

    @HeaderParam(HttpHeaders.USER_AGENT) val userAgent: String? = null
}