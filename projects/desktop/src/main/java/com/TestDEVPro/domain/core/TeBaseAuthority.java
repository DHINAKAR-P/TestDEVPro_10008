package com.TestDEVPro.domain.core;




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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class TeBaseAuthority  {


	/**
	*
	* For now this class is only used to make the compile succeed
	* and therefore it is not meant to be used - Dan Castillo 01/28/2015
	*
	*/


	public static int  ROLE_ADMIN = 100;
	public static int  ROLE_USER_OWNER = 2;
	public static int  ROLE_USER = 1;


	public int getRoleHierArchyPosition(String role_string) {

		if(role_string.equals("ROLE_ADMIN")) {
			return TeBaseAuthority.ROLE_ADMIN;
		}else if(role_string.equals("ROLE_USER_OWNER")) {
			return TeBaseAuthority.ROLE_USER_OWNER;
		}else if(role_string.equals("ROLE_USER")) {
			return TeBaseAuthority.ROLE_USER;
		} else {
			return 0;
		}
	}


}