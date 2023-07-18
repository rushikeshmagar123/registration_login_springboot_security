package com.example.demoBackend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demoBackend.Entity.User;
import com.example.demoBackend.Repository.UserRepository;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/loginpage")
    public String showLoginForm() {
        return "loginpage";
    }

    @PostMapping("/loginpage")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        // Retrieve the user from the database based on the username
        User user = userRepository.findByUsername(username);
        
        if (user != null && user.getPassword().equals(password)) {
        	 return "dashboard";
            }
        	
        	// Redirect to the dashboard upon successful login
         //   return "redirect:/dashboard";

         else {
            // Add an error message and redirect back to the login page if login fails
            return "redirect:/loginpage";
        }
    }
}
