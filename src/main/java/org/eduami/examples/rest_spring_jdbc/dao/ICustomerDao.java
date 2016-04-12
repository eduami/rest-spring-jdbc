package org.eduami.examples.rest_spring_jdbc.dao;

import org.eduami.examples.rest_spring_jdbc.model.Customer;

public interface ICustomerDao {
    public void insert(Customer customer);

    public void update(Customer customer);

    public void delete(Customer customer);

    public Customer findById(Integer id);


}
