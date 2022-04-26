package com.web.xiaomi_products.web;

import com.web.xiaomi_products.entity.User;
import com.web.xiaomi_products.service.CommentService;
import com.web.xiaomi_products.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @Autowired
    public RegistrationController (UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String registrationForm(Model model) {

        model.addAttribute("newUser", new User());
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(@ModelAttribute("newUser") @Valid User newUser, Errors errors, Model model) {

        if (errors.hasErrors()) {
            return "registration";
        }
        if (!newUser.getPassword().equals(newUser.getPasswordConfirm())){
            model.addAttribute("passwordError", "Пароли не совпадают");
            return "registration";
        }
        if (!userService.saveUser(newUser)){
            model.addAttribute("usernameError", "Пользователь с таким именем уже существует");
            return "registration";
        }

        return "redirect:/";
    }
}
