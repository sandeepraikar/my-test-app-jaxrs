package edu.sraikar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("date/{dateString}")
public class DateResource {

	@GET
	public String getRequestedDate(@PathParam("dateString") MyDate myDate){
		return "Got "+ myDate.toString();
	}
}
