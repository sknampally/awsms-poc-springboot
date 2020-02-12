package com.awsms.rest.dao;
 
import org.springframework.stereotype.Repository;

import com.awsms.rest.model.Employee;
import com.awsms.rest.model.Employees;
 
@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
     
    static
    {
        list.getEmployeeList().add(new Employee(1, "Satish Kumar", "Nampally", "snampally@intraedge.com"));
        list.getEmployeeList().add(new Employee(2, "Nilesh Nandkishor", "Deshmukh", "dnilesh@intraedge.com"));
        list.getEmployeeList().add(new Employee(3, "Baikuntha Bana Bihari", "Sahoo", "bbsahoo@intraedge.com"));
        list.getEmployeeList().add(new Employee(4, "Sukrit", "Khera", "skhera@intraedge.com"));
        list.getEmployeeList().add(new Employee(4, "Naveen Reddy", "P", "preddy@intraedge.com"));
    }
     
    public Employees getAllEmployees() 
    {
        return list;
    }
     
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}