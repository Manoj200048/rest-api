package lk.zerocode.Employee_api.controller;

import lk.zerocode.Employee_api.controller.request.AddEmployeeRequest;
import lk.zerocode.Employee_api.exception.EmployeeNotCreateException;
import lk.zerocode.Employee_api.model.Employee;
import lk.zerocode.Employee_api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {


    @Autowired
    private EmployeeService es;



    @PostMapping(value = "/add-employee")
    public void addEmployee(@RequestBody AddEmployeeRequest addEmployeeRequest) throws EmployeeNotCreateException {



        es.create(addEmployeeRequest);

        System.out.println("Employee added");

    }

    @GetMapping(value = "/employee/{id}")
    public Employee getEmployee(@PathVariable ("id") Long id){

        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("kavinda");
        employee.setSalary(100000.00);

        System.out.println("get employee with id "+id);

        return employee;

    }
}
