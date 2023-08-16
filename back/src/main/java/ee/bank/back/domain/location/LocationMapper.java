package ee.bank.back.domain.location;

import ee.bank.back.business.atm.AtmLocationRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface LocationMapper {

    @Mapping(source = "locationName",target = "name")
    @Mapping(constant ="A", target = "status")
  Location toLocation(AtmLocationRequest request);
}