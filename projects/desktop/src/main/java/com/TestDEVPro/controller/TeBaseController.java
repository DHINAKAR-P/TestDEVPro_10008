package com.TestDEVPro.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.TestDEVPro.domain.core.TeUser;



/**
 *
 * @author Geppetto Generated Code</br>
 * Date Created: </br>
 * @since  </br>
 * build:   </p>
 *
 * code was generated by the Geppetto System </br>
 * Gepppetto system Copyright - Geppetto LLC </br>
 * The generated code is free to use by anyone</p>
 *
 *
 *
*/
public class TeBaseController {

	private TeUser theUser;
	protected final Log logger = LogFactory.getLog(this.getClass());

	public TeUser getUser(){
		Authentication authentication = SecurityContextHolder.getContext()
				.getAuthentication();
		if (authentication != null) {
			Object principal = authentication.getPrincipal();
			if (principal instanceof TeUser) {
				theUser = (TeUser) principal;
				System.out.println("Loggedin user: " + theUser.getUsername());
			}
		}
		return theUser;
	}


}