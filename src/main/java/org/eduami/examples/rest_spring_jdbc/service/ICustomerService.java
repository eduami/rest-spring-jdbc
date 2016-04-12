package org.eduami.examples.rest_spring_jdbc.service;

import org.eduami.examples.rest_spring_jdbc.model.Customer;

public interface ICustomerService {
  public Customer getCustomer(Integer id);
  public void addCustomer(Customer customer);
}
