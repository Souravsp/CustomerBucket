package com.mantra.customer.bo.impl;

import com.mantra.customer.bo.CustomerBo;
import com.mantra.customer.dao.CustomerDAO;
import com.mantra.customer.model.Customer;

import java.util.List;

/**
 * Created by shaktisourav on 07/05/2017.
 */
public class CustomerBoImpl implements CustomerBo {

    CustomerDAO customerDAO;
    //DI via Spring
    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    //call DAO to save customer
    public void addCustomer(Customer customer){
        customerDAO.addCustomer(customer);
    }

    //call DAO to return customers
    public List<Customer> listCustomer(){
        return customerDAO.listCustomer();
    }
}
