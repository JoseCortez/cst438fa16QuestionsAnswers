package edu.csumb.cst438fa16QuestionsAnswers.rest;

import edu.csumb.cst438fa16QuestionsAnswers.QuestionsAnswers;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * REST service that greets requests.
 *
 * This is a "root resource class" as explained in
 * https://jersey.java.net/documentation/latest/jaxrs-resources.html
 */
@Path("/")
public class QuestionsAnswersService {
    @GET
    @Path("/today")
    public String today() {
	return QuestionsAnswers.today();
    }

    @GET
    @Path("/hello")
    public Response hello(@QueryParam("name") String name) {
    	//QuestionsAnswers.put()
    	
        if (name == null || name.isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        } else {
            return Response.ok("hello " + name).build();
        }
    }
}
