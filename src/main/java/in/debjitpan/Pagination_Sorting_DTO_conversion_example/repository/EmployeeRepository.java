package in.debjitpan.Pagination_Sorting_DTO_conversion_example.repository;

import in.debjitpan.Pagination_Sorting_DTO_conversion_example.domain.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees, Long> {}
