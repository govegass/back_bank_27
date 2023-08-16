package ee.bank.back.business.atm;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtmController {
    @Resource
    private AtmService atmService;
    @PostMapping("/atm/location")
    public void addAtmLocation(@RequestBody AtmLocationRequest request){
        atmService.addAtmLocation(request);
    }


}
