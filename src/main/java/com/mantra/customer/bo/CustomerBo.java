package com.mantra.customer.bo;

/**
 * Created by shaktisourav on 07/05/2017.
 */

import com.mantra.customer.model.Customer;

import java.util.List;

public interface CustomerBo {

    void addCustomer(Customer customer);

    List<Customer> listCustomer();

}
