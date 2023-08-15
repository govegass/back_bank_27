package ee.bank.back.business.city;

import ee.bank.back.domain.city.City;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link City}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityDto implements Serializable {
    private Integer cityId;
    @NotNull
    @Size(max = 255)
    private String cityName;
}