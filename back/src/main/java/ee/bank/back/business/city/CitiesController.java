package ee.bank.back.business.city;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CitiesController {
    @Resource
    private CitiesService citiesService;
    @GetMapping("/cities")
    @Operation(
            summary = "Leiab süsteemist (andmebaasist city tabelist) kõik linnad.",
            description = "Tagastab info koos cityId ja cityName'ga")
    public List<CityDto> getAllCities(){
        List<CityDto> cityDtos = citiesService.getAllCities();
        return cityDtos;

    }
}
