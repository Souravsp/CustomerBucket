package com.mantra.customer.action;

import com.mantra.customer.bo.CustomerBo;
import com.mantra.customer.model.Customer;
import com.opensymphony.xwork2.ModelDriven;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by shaktisourav on 07/05/2017.
 */
public class CustomerAction implements ModelDriven {

    Customer customer = new Customer();
    List<Customer> customerList = new ArrayList<Customer>();

    CustomerBo customerBo;
    //DI via Spring
    public void setCustomerBo(CustomerBo customerBo) {
        this.customerBo = customerBo;
    }

    public Object getModel() {
        return customer;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    //save customer
    public String addCustomer() throws Exception{

        //save it
        customer.setCreatedDate(new Date());
        customerBo.addCustomer(customer);

        //reload the customer list
        customerList = null;
        customerList = customerBo.listCustomer();

        return "success";

    }

    //list all customers
    public String listCustomer() throws Exception{

        customerList = customerBo.listCustomer();

        return "success";

    }

}