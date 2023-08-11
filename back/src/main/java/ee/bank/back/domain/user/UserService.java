package ee.bank.back.domain.user;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Resource
    private UserRepository userRepository;
    public User findActiveUserBy(String username, String password) {
        User user = userRepository.findUserBy(username, password, "A");
        return user;
    }
}
