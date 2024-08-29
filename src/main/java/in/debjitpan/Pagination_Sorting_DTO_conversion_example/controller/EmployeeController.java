package in.debjitpan.Pagination_Sorting_DTO_conversion_example.controller;

import in.debjitpan.Pagination_Sorting_DTO_conversion_example.controller.dto.EmployeesOutput;
import in.debjitpan.Pagination_Sorting_DTO_conversion_example.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<Page<EmployeesOutput>> getEmployees(Pageable pageable){
        return new ResponseEntity<>(employeeService.getAllEmployees(pageable), HttpStatus.OK);
    }

}
