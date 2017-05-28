package com.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.model.TransferContent;

@Path("/resources")
public class Resources {

	@POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.TEXT_PLAIN})
	public String imprimir(TransferContent transfer) {
		System.out.println(transfer);
		return "first service restful";
	}
}	
