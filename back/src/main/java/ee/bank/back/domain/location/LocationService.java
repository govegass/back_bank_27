package ee.bank.back.domain.location;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    @Resource
    private LocationRepository locationRepository;

    public void addLocation(Location location) {
        locationRepository.save(location);

    }
}
