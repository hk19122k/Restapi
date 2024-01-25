package com.codehk.restdemo;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class Cloudvendor_api_service {
	
	Cloudvendor cloudvendor;

	@GetMapping("{vendorId}")
	public Cloudvendor getvendordetails(String vendorId)
	{
		return  cloudvendor;
//	("A1","Vasulatha","Harmony H3","987654321");  
	}
	
	@PostMapping
	public String createvendordetails(@RequestBody Cloudvendor cloudvendor)
	{
		this.cloudvendor = cloudvendor;
		return "vendor details created" ;
		
	}
	
	@PutMapping
	public String updatevendordetails(@RequestBody Cloudvendor cloudvendor)
	{
		this.cloudvendor = cloudvendor;
		return "vendor details updated" ;
		
	}
	
	@DeleteMapping("{vendorId}")
	public String deletedetails(String vendorId )
	{
		this.cloudvendor = null;
		return "vendor details deleted" ;
		
	}
}

