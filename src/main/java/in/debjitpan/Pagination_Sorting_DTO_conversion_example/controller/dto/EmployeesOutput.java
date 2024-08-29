package in.debjitpan.Pagination_Sorting_DTO_conversion_example.controller.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeesOutput {

    private String name;
    private String email;
    private String department;
}
