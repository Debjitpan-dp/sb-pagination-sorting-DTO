package in.debjitpan.Pagination_Sorting_DTO_conversion_example.configuration;

import in.debjitpan.Pagination_Sorting_DTO_conversion_example.controller.dto.EmployeesOutput;
import in.debjitpan.Pagination_Sorting_DTO_conversion_example.domain.Employees;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapConfig {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
//        modelMapper.addMappings(new PropertyMap<Employees, EmployeesOutput>() {
//            @Override
//            protected void configure() {
//                map().setName(source.getFirstName() + " " + source.getLastName());
//            }
//        });
        return modelMapper;
    }
}
