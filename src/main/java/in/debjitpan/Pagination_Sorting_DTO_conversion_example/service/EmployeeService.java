package in.debjitpan.Pagination_Sorting_DTO_conversion_example.service;

import in.debjitpan.Pagination_Sorting_DTO_conversion_example.controller.dto.EmployeesOutput;
import in.debjitpan.Pagination_Sorting_DTO_conversion_example.domain.Employees;
import in.debjitpan.Pagination_Sorting_DTO_conversion_example.repository.EmployeeRepository;
import java.util.function.Function;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper modelMapper;

  public Page<EmployeesOutput> getAllEmployees(Pageable pageable) {
    //        return employeeRepository.findAll()
    //                .stream()
    //                .map(this::convertEntityToDto)
    //                .collect(Collectors.toList());}

//      TypeMap<Employees, EmployeesOutput> propertyMapper = this.modelMapper.createTypeMap(Employees.class, EmployeesOutput.class);
      // add deep mapping to flatten source's Player object into a single field in destination
//      modelMapper.addMappings(new PropertyMap<Employees, EmployeesOutput>() {
//          @Override
//          protected void configure() {
//              map().setName(source.getFirstName() + " " + source.getLastName());
//          }
//      });
      Page<Employees> employees = employeeRepository.findAll(pageable);
    //      Page<EmployeesOutput> employeesOutput = employees.map(e ->
    // this.modelMapper.map(employees
      return employees.map(new Function<Employees, EmployeesOutput>() {

          @Override
          public EmployeesOutput apply(Employees t) {
              return new ModelMapper().map(t, EmployeesOutput.class);
          }

      });
  }


    private EmployeesOutput convertEntityToDto(Employees employees){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper.map(employees, EmployeesOutput.class);
    }

    private Employees convertDtoToEntity(EmployeesOutput employeesOutput){
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper.map(employeesOutput, Employees.class);
    }
}
