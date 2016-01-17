package com.mpant.finra.demo;
 
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Application;
import java.util.List;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import com.mpant.finra.demo.NumToAlphaCnv;

@Path("/pant/{phonenos: .+}")
public class NumToaAlphaCnvService {
	 
	 @GET
	 @Produces("text/plain")
	 
	 public Response getUserByName(@PathParam("phonenos") String phoneno)  
	  {
		 System.out.println("INSIDE SERVICE  - INSIDE SERVICE" + phoneno);
		    
		    List<String> combos = NumToAlphaCnv.numalpha(phoneno);
		    
		    StringBuilder sb = new StringBuilder();
		    for (String s : combos)
		    {
		      System.out.println(s);
		      sb.append(s);
		      sb.append(",");
		    }
		    String alphanum = sb.toString();
		     
		    //return alphanum;
		    return Response.status(200)
					.entity(alphanum).build();
		    		 
		  }
		}

