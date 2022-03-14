/**
* Global Customer ID Controller
*
* @author  Shib Basak
* @version 1.0
* @since   2021-12-02 
* 
*/



package com.abc.app.edw;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GlobalIdController {
	
	private final GlobalIdService globalIdService;
	
	@Autowired
	public GlobalIdController(GlobalIdService globalIdService) {
		this.globalIdService = globalIdService;
	}
	
	
	@GetMapping("/api/gcid/v1/test")
	public String test() {
		return "GCID - Greetings from Spring Boot! Test URL. Release #12.16.1";
	}
	

	@GetMapping("/api/gcid/v1/ids")
	public List<SourceToParty> getStudents() {
		return globalIdService.getAll();
	}
	

}
