package com.mantra.customer.dao;

/**
 * Created by shaktisourav on 07/05/2017.
 */

import com.mantra.customer.model.Customer;

import java.util.List;

public interface CustomerDAO{

    void addCustomer(Customer customer);
    List<Customer> listCustomer();

}
