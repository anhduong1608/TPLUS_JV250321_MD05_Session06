package ra.edu.md05_sesion06_06.controller;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {
    private final EmployeeService service = new EmployeeService();

    @GetMapping("EmployeeController")
    public String listEmployees(Model model, @RequestParam(defaultValue = "1") int page) {
        int pageSize = 3;
        List<Employee> all = service.getAllEmployees();
        int start = (page - 1) * pageSize;
        int end = Math.min(start + pageSize, all.size());
        List<Employee> pageList = all.subList(start, end);

        model.addAttribute("employees", pageList);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", (int)Math.ceil(all.size() / (double)pageSize));
        return "listEmployee";
    }

    @GetMapping("/employees/add")
    public String showAddForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "addEmployee";
    }

    @PostMapping("/employees")
    public String addEmployee(@ModelAttribute Employee e, Model model) {
        service.addEmployee(e);
        model.addAttribute("message", "Thêm thành công!");
        return "redirect:/employees";
    }
}
