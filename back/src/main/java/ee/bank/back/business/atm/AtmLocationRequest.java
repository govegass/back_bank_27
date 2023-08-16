package ee.bank.back.business.atm;

import lombok.Data;

import java.util.List;

@Data
public class AtmLocationRequest {
private Integer cityId;
private String locationName;
private Integer numberOfAtms;
private String imageData;
private List<TransactionTypeDto> transactionTypes;

}
