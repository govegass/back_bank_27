package ee.bank.back.business.atm;

import ee.bank.back.domain.city.City;
import ee.bank.back.domain.city.CityService;
import ee.bank.back.domain.location.Location;
import ee.bank.back.domain.location.LocationMapper;
import ee.bank.back.domain.location.LocationService;
import ee.bank.back.domain.location.transactiontype.TransactionType;
import ee.bank.back.domain.location.transactiontype.TransactionTypeService;
import ee.bank.back.domain.transactiontype.LocationTransactionType;
import ee.bank.back.domain.transactiontype.LocationTransactionTypeService;
import jakarta.annotation.Resource;
import org.hibernate.dialect.function.ListaggStringAggEmulation;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

@Service
public class AtmService {
    @Resource
private LocationMapper locationMapper;
    @Resource
    private CityService cityService;
    @Resource
    private LocationService locationService;
    @Resource
    private LocationTransactionTypeService locationTransactionTypeService;
    @Resource
    private TransactionTypeService transactionTypeService;


    public void addAtmLocation(AtmLocationRequest request) {
        Location location = createAndAddLocation(request);
        List<LocationTransactionType> locationTransactionTypes = createLocationTransactionTypes(request, location);
        locationTransactionTypeService.addLocationTransactionTypes(locationTransactionTypes);

    }

    private List<LocationTransactionType> createLocationTransactionTypes(AtmLocationRequest request, Location location) {
        List<LocationTransactionType> locationTransactionTypes=new ArrayList<>();
        List<TransactionTypeDto> transactionTypeDtos= request.getTransactionTypes();
        for (TransactionTypeDto transactionTypeDto : transactionTypeDtos) {
            TransactionType transactionType = transactionTypeService.findTransactionTypeBy(transactionTypeDto.getTransactionTypeId());
            LocationTransactionType locationTransactionType = new LocationTransactionType();
            locationTransactionType.setLocation(location);
            locationTransactionType.setIsSelected(transactionTypeDto.getIsSelected());

            locationTransactionTypes.add(locationTransactionType);



        }
        return locationTransactionTypes;
    }

    private Location createAndAddLocation(AtmLocationRequest request) {
        Location location = locationMapper.toLocation(request);
        City city = cityService.findCityById(request.getCityId());
        location.setCity(city);
        locationService.addLocation(location);
        return location;
    }
}
