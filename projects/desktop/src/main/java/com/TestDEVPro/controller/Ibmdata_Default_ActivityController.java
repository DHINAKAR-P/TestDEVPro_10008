package com.TestDEVPro.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.*;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;


import com.TestDEVPro.domain.core.Ibmdata;

import com.TestDEVPro.config.TestDEVProSwaggerUIConstants;

import com.TestDEVPro.service.Ibmdata_Default_ActivityService;



/**
 *
 * @author Geppetto Generated Code</br>
 * Date Created: </br>
 * @since  </br>
   build:   </p>
 *
 * code was generated by the Geppetto System </br>
 * Gepppetto system Copyright - Geppetto LLC 2014 - 2015</br>
 * The generated code is free to use by anyone</p>
 *
 *
 *
*/

@Api(value = "/ibmdata_Default_Activity", description = "ibmdata_Default_Activity of ibmdata_Default_Activity",produces = "application/json")
@CrossOrigin
@Controller("Ibmdata_Default_ActivityController")
@RequestMapping("/ibmdata_Default_Activity")
public class Ibmdata_Default_ActivityController  extends TeBaseController implements TestDEVProSwaggerUIConstants {

private static Logger log = Logger.getLogger(Ibmdata_Default_ActivityController.class.getName());

	private Ibmdata_Default_ActivityService ibmdata_Default_Activity_service;


	public Ibmdata_Default_ActivityService get_ibmdata_Default_Activity_service() {
		return ibmdata_Default_Activity_service;
	}


	@Resource(name="Ibmdata_Default_ActivityService")
	public void set_ibmdata_Default_Activity_service(Ibmdata_Default_ActivityService ibmdata_Default_Activity_service) {
		this.ibmdata_Default_Activity_service = ibmdata_Default_Activity_service;
	}




	//auths not ready at this time
	/**
	*The purpose of this method is to perform save operation of  Ibmdata noun into database
	* @param the_Ibmdata
	*@return Ibmdata object will return
	*@throws Exception
	*
	*
	*/


	@ApiOperation(value = "/create_Ibmdata", httpMethod = "POST",notes = "creates a noun of Ibmdata",response = Ibmdata.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = TestDEVProSwaggerUIConstants.SUCCESS),
	    @ApiResponse(code = 404, message = TestDEVProSwaggerUIConstants.NOT_FOUND),
	    @ApiResponse(code = 500, message = TestDEVProSwaggerUIConstants.INTERNAL_SERVER_ERROR),
	    @ApiResponse(code = 400, message = TestDEVProSwaggerUIConstants.BAD_REQUEST),
	    @ApiResponse(code = 412, message = TestDEVProSwaggerUIConstants.PRE_CONDITION_FAILED) })


	@RequestMapping(method = RequestMethod.POST,value = "/create_Ibmdata" ,headers="Accept=application/json")
    @ResponseBody
	public Ibmdata create_Ibmdata(@RequestBody Ibmdata the_Ibmdata) throws Exception {

		log.setLevel(Level.INFO);
	    log.info("create_Ibmdata controller started operation!");

		Ibmdata a_Ibmdata;

		a_Ibmdata = ibmdata_Default_Activity_service.create_ibmdata(the_Ibmdata, super.getUser());

		log.info("Object returned from create_Ibmdata method !");

		return a_Ibmdata;


	}


	//auths not ready at this time
	/**
	*The purpose of this method is to perform update operation of  Ibmdata noun into database
	*@param the_Ibmdata
	*@return Ibmdataobject will return
	*@throws Exception
	*
	*
	*/


	@ApiOperation(value = "/update_Ibmdata", httpMethod = "PUT",notes = "updates a noun of Ibmdata",response = Ibmdata.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = TestDEVProSwaggerUIConstants.SUCCESS),
	    @ApiResponse(code = 404, message = TestDEVProSwaggerUIConstants.NOT_FOUND),
	    @ApiResponse(code = 500, message = TestDEVProSwaggerUIConstants.INTERNAL_SERVER_ERROR),
	    @ApiResponse(code = 400, message = TestDEVProSwaggerUIConstants.BAD_REQUEST),
	    @ApiResponse(code = 412, message = TestDEVProSwaggerUIConstants.PRE_CONDITION_FAILED) })


	@RequestMapping(method = RequestMethod.PUT,value = "/update_Ibmdata" ,headers="Accept=application/json")
    @ResponseBody
	public Ibmdata update_Ibmdata(@RequestBody Ibmdata the_Ibmdata) throws Exception {

		log.setLevel(Level.INFO);
	    log.info("update_Ibmdata controller started operation!");

		Ibmdata a_Ibmdata;

		a_Ibmdata = ibmdata_Default_Activity_service.update_ibmdata(the_Ibmdata, super.getUser());

		log.info("Object returned from update_Ibmdata method !");

		return a_Ibmdata;


	}


	//auths not ready at this time
	/**
	*The purpose of this method is to perform fetch operation of  Ibmdata noun from  database based on given noun id
	*@param Ibmdata_id
	*@return Ibmdataobject will return
	*@throws Exception
	*
	*
	*/


	@ApiOperation(value = "/search_for_update_Ibmdata/{Ibmdata_id}", httpMethod = "GET",notes = "updates a noun of Ibmdata",response = Ibmdata.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = TestDEVProSwaggerUIConstants.SUCCESS),
	    @ApiResponse(code = 404, message = TestDEVProSwaggerUIConstants.NOT_FOUND),
	    @ApiResponse(code = 500, message = TestDEVProSwaggerUIConstants.INTERNAL_SERVER_ERROR),
	    @ApiResponse(code = 400, message = TestDEVProSwaggerUIConstants.BAD_REQUEST),
	    @ApiResponse(code = 412, message = TestDEVProSwaggerUIConstants.PRE_CONDITION_FAILED) })


	@RequestMapping(method = RequestMethod.GET,value = "/search_for_update_Ibmdata/{Ibmdata_id}" ,headers="Accept=application/json")
    @ResponseBody
	public Ibmdata search_for_update_Ibmdata(@PathVariable("Ibmdata_id")long Ibmdata_id) throws Exception {

		log.setLevel(Level.INFO);
	    log.info("search_for_update_Ibmdata controller started operation!");

		Ibmdata the_Ibmdata = new Ibmdata();

		the_Ibmdata = ibmdata_Default_Activity_service.ibmdata_search_for_update(Ibmdata_id, super.getUser());

		log.info("Object returned from search_for_update_Ibmdata method !");

		return the_Ibmdata;


	}


	//auths not ready at this time
	/**
	*The purpose of this method is to perform delete operation of  Ibmdata noun from  database based on given noun id
	*@param Ibmdata_id
	*@return Ibmdataobject will return
	*@throws Exception
	*
	*
	*/


	@ApiOperation(value = "/delete_Ibmdata/{Ibmdata_id}", httpMethod = "DELETE",notes = "deletes a noun of Ibmdata",response = Ibmdata.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = TestDEVProSwaggerUIConstants.SUCCESS),
	    @ApiResponse(code = 404, message = TestDEVProSwaggerUIConstants.NOT_FOUND),
	    @ApiResponse(code = 500, message = TestDEVProSwaggerUIConstants.INTERNAL_SERVER_ERROR),
	    @ApiResponse(code = 400, message = TestDEVProSwaggerUIConstants.BAD_REQUEST),
	    @ApiResponse(code = 412, message = TestDEVProSwaggerUIConstants.PRE_CONDITION_FAILED) })


	@RequestMapping(method = RequestMethod.DELETE,value = "/delete_Ibmdata/{Ibmdata_id}" ,headers="Accept=application/json")
    @ResponseBody
	public String  delete_Ibmdata(@PathVariable("Ibmdata_id")long Ibmdata_id) throws Exception {

		log.setLevel(Level.INFO);
	    log.info("delete_Ibmdata controller started operation!");

		String service_return_msg = "";

		service_return_msg = ibmdata_Default_Activity_service.delete_ibmdata(Ibmdata_id, super.getUser());

		log.info("Object returned from delete_Ibmdata method !");

		return service_return_msg;


	}


	//auths not ready at this time
	/**
	*The purpose of this method is to get list of  Ibmdata noun from  database
	*
	*@return List of Ibmdata objects will return
	*@throws Exception
	*
	*
	*/


	@ApiOperation(value = "/get_all_Ibmdata", httpMethod = "GET",notes = "special search that gets all values of Ibmdata",response = Ibmdata.class)
	@ApiResponses(value = {
		@ApiResponse(code = 200, message = TestDEVProSwaggerUIConstants.SUCCESS),
	    @ApiResponse(code = 404, message = TestDEVProSwaggerUIConstants.NOT_FOUND),
	    @ApiResponse(code = 500, message = TestDEVProSwaggerUIConstants.INTERNAL_SERVER_ERROR),
	    @ApiResponse(code = 400, message = TestDEVProSwaggerUIConstants.BAD_REQUEST),
	    @ApiResponse(code = 412, message = TestDEVProSwaggerUIConstants.PRE_CONDITION_FAILED) })


	@RequestMapping(method = RequestMethod.GET,value = "/get_all_Ibmdata" ,headers="Accept=application/json")
    @ResponseBody
	public List<Ibmdata> get_all_Ibmdata() throws Exception {

		log.setLevel(Level.INFO);
	    log.info("get_all_Ibmdata controller started operation!");

		List<Ibmdata> Ibmdata_list = new ArrayList<Ibmdata>();

		Ibmdata_list = ibmdata_Default_Activity_service.get_all_ibmdata();

		log.info("Object returned from get_all_Ibmdata method !");

		return Ibmdata_list;


	}




}