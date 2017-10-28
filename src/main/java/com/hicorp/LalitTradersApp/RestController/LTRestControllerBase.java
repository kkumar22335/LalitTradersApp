/**
 * 
 */
package com.hicorp.LalitTradersApp.RestController;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

/**
 * @author Krishna Khatana
 *
 */

public class LTRestControllerBase {

	/**
	 * Build a response object that includes total row count in the header if
	 * needed and also include the result list.
	 * 
	 * @param returnTotalRecordsCount
	 * @param output
	 * @return
	 */
	public <T> Response buildPageableResultsResponse(String clientNumber) {
		// Build response object so that we can include total row count in the
		// header as needed
		ResponseBuilder responseBuilder = Response.status(Response.Status.OK);
		responseBuilder.type(MediaType.APPLICATION_JSON);
		
		responseBuilder.header("RESPONSE_HEADERS.TOTAL_RECORD_COUNT", clientNumber);

		responseBuilder.entity(clientNumber);

		Response response = responseBuilder.build();

		return response;
	}

	
	
}
