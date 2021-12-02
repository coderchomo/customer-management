package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;

public interface ICustomerService extends IGenericService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
