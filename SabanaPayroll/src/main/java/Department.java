import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

public class Department {

    private List<Employee>employees;

    private UUID id;
    private String name;

    public Department(String name){
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
