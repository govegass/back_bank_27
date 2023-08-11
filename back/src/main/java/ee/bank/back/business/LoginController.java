package ee.bank.back.business;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Resource
    private LoginService loginService;
    @GetMapping("/login")

    public LoginResponse login(@RequestParam String username, @RequestParam String password){
       LoginResponse response=loginService.login(username,password);
        return response;
    }
}
