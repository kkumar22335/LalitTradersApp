/**
 * 
 */
package com.hicorp.LalitTradersApp.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

/**
 * @author Krishna Khatana
 *
 */
@Path("/blog")
@Controller("blogController")
public class BlogController extends LTRestControllerBase {

	private static Logger LOGGER = LoggerFactory.getLogger(BlogController.class);


	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response retrieveAllInvoices(
			@DefaultValue("88027_FS") @QueryParam("clientid") String clientNumber, 
			@Context HttpServletRequest req) throws Exception
	{

		if( LOGGER.isDebugEnabled() ){
			LOGGER.debug( "------------------------------------------------------------------------" );
			LOGGER.debug( "------ retrieve Invoices ------------------------------" );
			LOGGER.debug( "------------------------------------------------------------------------" );
    	}
		Response response;
		
		// Build response object with paginated result and appropriate headers
		response = this.buildResponse(clientNumber);	
		LOGGER.debug("end");
		return response;
	

	}


	/**
	 * Build a response object with paginated result and appropriate headers. 
	 * 
	 * @param clientNumber
	 * @return 
	 */
	private <T> Response buildResponse(String clientNumber) {
		
		// Build response object so that we can include total row count in the header as needed
		Response response = buildPageableResultsResponse(clientNumber);
		return response;
	}
	
}