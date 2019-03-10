package education.springboot.microservices.employee;

import lombok.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class EmployeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeApplication.class, args);
    }

}

@Value
class Employee {

    private String firstName;
    private String lastName;
}

@RestController
class EmployeeController {

    @GetMapping
    public List<Employee> getAll() {
        return List.of(new Employee("Petros", "Stergioulas"));
    }
}
