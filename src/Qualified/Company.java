package Qualified;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tieorange on 20/04/16.
 */
public class Company {
    private Map<String, Employee> employeeMap = new HashMap<>();

    public Employee getEmployee(String id) {
        if (id != null) {
            return employeeMap.get(id);
        } else {
            throw new RuntimeException("Employee id is NULL");
        }
    }

    public void addEmployee(Employee newEmployee) {
        if (newEmployee == null) {
            throw new RuntimeException("newEmployee is NULL");
        } else {
            if (!employeeMap.containsKey(newEmployee.getId())) {
                employeeMap.put(newEmployee.getId(), newEmployee);
            } else {
                throw new RuntimeException("Employee is already in that company");
            }
        }
    }

    public void removeEmployee(String id) {
        if (id == null) {
            throw new RuntimeException("id is NULL");
        } else {
            employeeMap.remove(id);
        }
    }
}
