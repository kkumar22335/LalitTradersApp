/**
 * 
 */
package com.hicorp.LalitTradersApp.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import com.hicorp.LalitTradersApp.RestController.BlogController;
import com.hicorp.LalitTradersApp.RestController.HomeController;
import com.hicorp.LalitTradersApp.RestController.LTRestControllerBase;
import com.hicorp.LalitTradersApp.RestController.LoginController;

/**
 * @author Krishna Khatana
 *
 */
public class JerseyConfig extends ResourceConfig{

	public JerseyConfig() {
        register(RequestContextFilter.class);
        register(LTRestControllerBase.class);
        register(LoginController.class);
        register(HomeController.class);
        register(BlogController.class);
        register(LoginController.class);
      
    }
	
}
