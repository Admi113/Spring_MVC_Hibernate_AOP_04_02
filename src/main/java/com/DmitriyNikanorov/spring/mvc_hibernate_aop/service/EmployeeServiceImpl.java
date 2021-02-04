package com.DmitriyNikanorov.spring.mvc_hibernate_aop.service;

import com.DmitriyNikanorov.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.DmitriyNikanorov.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDAO employeeDao;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDao.saveEmployee(employee);
    }
}