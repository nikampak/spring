package come.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/user")
    // "user" is the endpoint that you place in URL http://localhost:9090/user
    public String user(){
//        return "userinfo.html"; // goes to folder "static" and look over there
    // "/user/userinfo.html" is a path to the file -> goes to folder "user"
        return "/user/userinfo.html";
    }
}
