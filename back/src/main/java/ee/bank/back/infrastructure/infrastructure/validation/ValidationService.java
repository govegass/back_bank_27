package ee.bank.back.infrastructure.infrastructure.validation;

import ee.bank.back.domain.user.User;
import ee.bank.back.infrastructure.infrastructure.exception.BusinessException;

import java.util.Optional;

import static ee.bank.back.infrastructure.infrastructure.validation.Error.INCORRECT_CREDENTIALS;

public class ValidationService {
    public static User getValidUser(Optional<User> optionalUser) {
        if(optionalUser.isEmpty()){
            throw new BusinessException(INCORRECT_CREDENTIALS.getMessage(), INCORRECT_CREDENTIALS.getErrorCode());
        }
        User user = optionalUser.get();
        return user;
    }
}
