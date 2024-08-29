package in.debjitpan.Pagination_Sorting_DTO_conversion_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import static org.springframework.data.web.config.EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO;

@SpringBootApplication
@EnableSpringDataWebSupport(pageSerializationMode = VIA_DTO)
public class PaginationSortingDtoConversionExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaginationSortingDtoConversionExampleApplication.class, args);
	}

}
