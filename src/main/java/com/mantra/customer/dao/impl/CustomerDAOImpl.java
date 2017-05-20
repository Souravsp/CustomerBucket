package com.mantra.customer.dao.impl;

import com.mantra.customer.dao.CustomerDAO;
import com.mantra.customer.model.Customer;
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by shaktisourav on 07/05/2017.
 */
@Repository
@Transactional
public class CustomerDAOImpl implements CustomerDAO {
    private static final Logger logger = LoggerFactory.getLogger(CustomerDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    //add the customer
    public void addCustomer(Customer customer) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(customer);
        logger.info("customer saved successfully, customer Details=" + customer);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Customer> listCustomer() {
        Session session = this.sessionFactory.getCurrentSession();
        System.out.println(session.toString());
        List<Customer> customersList = session.createQuery("from Customer").list();
        for (Customer p : customersList) {
            logger.info("Customer List::" + p);
        }
        return customersList;
    }

}