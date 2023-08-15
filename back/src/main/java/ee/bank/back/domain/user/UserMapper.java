package ee.bank.back.domain.user;

import ee.bank.back.business.login.LoginResponse;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    @Mapping(source = "id", target="userId")
    @Mapping(target="roleName", source = "role.name")
    LoginResponse toDto(User user);
}