package ngdemo.rest;

import java.io.PrintStream;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/pant/{phonenos: .+}")
public class UserPantService
{
  @GET
  @Produces({"text/plain"})
  public String getDefaultUserInJSON(@PathParam("phonenos") String phonenos)
  {
    System.out.println("INSIDE SERVICE ");
    
    List<String> combos = convertnum.numtoalpha(phonenos);
    
    StringBuilder sb = new StringBuilder();
    for (String s : combos)
    {
      System.out.println(s);
      sb.append(s);
      sb.append(",");
    }
    String alphanum = sb.toString();
     
    return alphanum;
  }
}
