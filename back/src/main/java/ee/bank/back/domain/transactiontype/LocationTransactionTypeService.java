package ee.bank.back.domain.transactiontype;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationTransactionTypeService {
    @Resource
    private LocationTransactionTypeRepository locationTransactionTypeRepository;
    public void addLocationTransactionTypes(List<LocationTransactionType> locationTransactionTypes) {
        locationTransactionTypeRepository.saveAll(locationTransactionTypes);
    }
}
