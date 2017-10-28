/**
 * 
 */
package com.hicorp.LalitTradersApp.RestController;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Krishna Khatana
 *
 */
@Controller
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView getLoginPage(@RequestParam Optional<String> error) {
		return new ModelAndView("login", "error", error);
    }
	
	@RequestMapping(value = "/loggedout", method = RequestMethod.GET)
    public ModelAndView getLogoutPage(@RequestParam Optional<String> error) {
		return new ModelAndView("loggedout", "error", error);
    }
	
/*	@RequestMapping(value = "/badCredentials", method = RequestMethod.GET)
    public ModelAndView handleBadCredentials() {
		return new ModelAndView("login", "badCredentials", "badCredentials");
    }

	@RequestMapping(value = "/accountDisabled", method = RequestMethod.GET)
    public ModelAndView handleAccountDisabled() {
		return new ModelAndView("login", "accountDisabled", "accountDisabled");
    }
	
	@RequestMapping(value = "/accountLocked", method = RequestMethod.GET)
    public ModelAndView handleAccountLocked() {
		return new ModelAndView("login", "accountLocked", "accountLocked");
    }*/
	
	@RequestMapping(value = "/handleError", method = RequestMethod.GET)
    public ModelAndView handleError() {
		return new ModelAndView("login", "error", "error");
    }

}
