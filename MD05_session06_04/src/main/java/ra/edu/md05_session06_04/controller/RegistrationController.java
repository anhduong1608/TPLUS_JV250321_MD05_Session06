package ra.edu.md05_session06_04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ra.edu.md05_session06_04.model.entity.User;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = {"/", "/RegistrationController"})
public class RegistrationController {
    @GetMapping("/")
            public String index() {
        return "registration";
    }

    List<User> users = new ArrayList<>();
    @PostMapping
    public String registration(Model model, @RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("phonenumber") String phonenumber) {
        User user = new User();
        boolean hasError = false;
        if (name == null || name.trim().isEmpty()) {
            model.addAttribute("message", "Please enter your name");
           hasError = true;
        } else {
            user.setName(name);

        }

        if (email == null || email.trim().isEmpty()) {
            model.addAttribute("message1", "Please enter your email");
            hasError = true;
        } else {
            String emailRexgex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
            if (email.matches(emailRexgex)) {
                user.setEmail(email);

            } else {
                model.addAttribute("message1", "Invalid email");
                hasError = true;
            }
        }
        if (phonenumber == null || phonenumber.trim().isEmpty()) {
            model.addAttribute("message3", "Please enter your phone number");
                hasError  = true;
        } else {
            String phonenumberRexgex = "^[0-9]{10,11}$";
            if (phonenumber.matches(phonenumberRexgex)) {
                user.setPhoneNumber(phonenumber);

            } else {
                model.addAttribute("message3", "Invalid phone number");
                 hasError  = true;
            }
        }
        if(hasError){
          model.addAttribute("user", user);
            return "registration";
        }
        users.add(user);
        model.addAttribute("users", users);
        return "result";
    }

}
