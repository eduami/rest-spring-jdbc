package org.eduami.examples.rest_spring_jdbc.service;

import org.eduami.examples.rest_spring_jdbc.dao.ICustomerDao;
import org.eduami.examples.rest_spring_jdbc.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerService implements ICustomerService {

	@Autowired
	private ICustomerDao customerDao;

	@Override
	public Customer getCustomer(Integer id) {
		return customerDao.findById(id);
	}

	@Override
	public void addCustomer(Customer customer) {
		customerDao.insert(customer);
	}

}
