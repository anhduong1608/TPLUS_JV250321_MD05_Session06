package ra.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.edu.dao.StudentDAO;

import java.util.List;

@Controller
@RequestMapping(value = {"/","/hello"})
public class HelloController {
    @Autowired
    private StudentDAO studentDAO;

    @GetMapping
    public String hello(Model model) {
        model.addAttribute("message", "Nguyễn Hoàng Việt");

        List<String> listString = studentDAO.getListString();
        model.addAttribute("listString", listString);

        return "hello";
    }
}
