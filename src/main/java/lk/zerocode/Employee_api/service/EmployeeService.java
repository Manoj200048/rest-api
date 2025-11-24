package lk.zerocode.Employee_api.service;

import lk.zerocode.Employee_api.controller.request.AddEmployeeRequest;
import lk.zerocode.Employee_api.exception.EmployeeNotCreateException;
import lk.zerocode.Employee_api.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public void create(AddEmployeeRequest rq) throws EmployeeNotCreateException {

        if(rq.getSalary()>=30000){

            Employee e = new Employee();

            e.setName(rq.getName());
            e.setId(rq.getId());
            e.setSalary(rq.getSalary());

            System.out.println("Employee created");
        }

        else{
            throw new EmployeeNotCreateException("salary not valid");
        }

    }


}
