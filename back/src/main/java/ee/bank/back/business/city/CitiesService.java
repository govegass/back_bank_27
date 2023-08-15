package ee.bank.back.business.city;

import ee.bank.back.domain.city.City;
import ee.bank.back.domain.city.CityMapper;
import ee.bank.back.domain.city.CityService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitiesService {
    @Resource
    private CityMapper cityMapper;
    @Resource
    private CityService cityService;
    public List<CityDto> getAllCities() {
        List<City> cities = cityService.getAllCities();
        List<CityDto> cityDtos = cityMapper.toCityDtos(cities);
        return cityDtos;

    }
}
