package ee.bank.back.business;

import ee.bank.back.domain.user.User;
import ee.bank.back.domain.user.UserMapper;
import ee.bank.back.domain.user.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Resource
    private UserService userService;
    @Resource
    private UserMapper userMapper;
    public LoginResponse login(String username, String password) {
        User user = userService.findActiveUserBy(username, password);
        LoginResponse loginResponse = userMapper.toDto(user);
        return loginResponse;


    }
}
