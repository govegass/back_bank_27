package ee.bank.back.domain.user;

import ee.bank.back.infrastructure.infrastructure.exception.BusinessException;
import ee.bank.back.infrastructure.infrastructure.validation.ValidationService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static ee.bank.back.infrastructure.infrastructure.validation.Error.INCORRECT_CREDENTIALS;

@Service
public class UserService {
    @Resource
    private UserRepository userRepository;
    public User findActiveUserBy(String username, String password) {
        Optional<User> optionalUser = userRepository.findUserBy(username, password, "A");
        User user=ValidationService.getValidUser(optionalUser);
        return user;


    }


}
