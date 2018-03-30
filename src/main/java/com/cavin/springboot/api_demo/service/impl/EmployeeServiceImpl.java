package com.cavin.springboot.api_demo.service.impl;

import com.cavin.springboot.api_demo.dao.EmployeeMapper;
import com.cavin.springboot.api_demo.model.Employee;
import com.cavin.springboot.api_demo.service.EmployeeService;
import com.cavin.springboot.api_demo.common.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/03/29.
 */
@Service
@Transactional
public class EmployeeServiceImpl extends AbstractService<Employee> implements EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;

}
