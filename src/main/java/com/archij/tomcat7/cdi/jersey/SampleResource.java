/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archij.tomcat7.cdi.jersey;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author pellegrini
 */
@Path("/hello")
public class SampleResource {

    @Inject
    InjectedBean injectedBean;
    
    @GET
    @Produces("text/html")
    @Path("/helloWorld")
    public String printHelloWorld() {
        return "Hello World";
    }
    
    
    @GET
    @Produces("text/html")
    @Path("/helloCDI")
    public String printHelloCDI() {
        return injectedBean.sayHello();
    }
    
    
     @GET
    @Produces("text/html")
    @Path("/helloDelegate")
    public String printHelloDelegate() {
        return injectedBean.sayHelloDelegate();
    }
}
