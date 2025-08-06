package ra.edu.ennity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.edu.ennity.model.user;
import ra.edu.ennity.service.UserService;

import java.util.List;

@Controller
@RequestMapping(value = {"/", "/UserController"})
public class UserController{
    @Autowired
    private UserService userService;

    @GetMapping
    public String showList(Model model){
        List<user> userList = userService.getAll();
        System.out.println("users"+userList);
        model.addAttribute("users",userList);
        return "users";
    }

}
