package org.eduami.examples.rest_spring_jdbc.controller;

import org.eduami.examples.rest_spring_jdbc.model.Customer;
import org.eduami.examples.rest_spring_jdbc.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("customerController")
@RequestMapping("/rest")
public class CustomerController {
	@Autowired
	private ICustomerService customerService;

	@RequestMapping(value="/customer",method = RequestMethod.GET)
	public Customer getCustomer(@RequestParam(value = "id", required = false, defaultValue = "1") Integer id) {
		Customer p = customerService.getCustomer(id);
		return p;
	}
	
	@RequestMapping(value="/customer",method = RequestMethod.POST)
	public void  addCustomer(@RequestBody Customer customer){
		customerService.addCustomer(customer);
	}
}