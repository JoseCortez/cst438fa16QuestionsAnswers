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
    
    public static QuestionsAnswers q1;
    
    
//    public static void main(String[] args)
//    {
//        q1 = new QuestionsAnswers();
//        q1.put("What is my name?", "Jose Cortez");
//        q1.put("What day does Christmas fall on?", "25");
//        q1.put("What is 10 + 5", "15");
//        //System.out.print("test");
//    }
    
    @GET
    @Path("/randomquestion")
    public String randomquestion() {
        q1 = new QuestionsAnswers();
        q1.put("What is my name?", "Jose Cortez");
        q1.put("What day does Christmas fall on?", "25");
        q1.put("What is 10 + 5", "15");

        //return "test";
        //System.out.print("test");

        return q1.getRandomQuestion();
    }
    
    @GET
    @Path("/testanswer")
    public Response testanswer(@QueryParam("question") String question, @QueryParam("answer") String answer) {
        if (question == null) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        } else {
            return Response.ok(q1.testAnswer(question, answer)).build();
        }
    }
    
    
    
}