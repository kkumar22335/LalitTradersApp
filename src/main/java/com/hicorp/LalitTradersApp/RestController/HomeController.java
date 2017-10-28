/**
 * 
 */
package com.hicorp.LalitTradersApp.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Krishna Khatana
 *
 */

@RestController
public class HomeController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String getHomePage() {
		return "home";
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHomePageForNoPath() {
		return "home";
	}
}
