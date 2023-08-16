package ee.bank.back.business.atm;

import lombok.Data;

@Data
public class TransactionTypeDto {
    private Integer transactionTypeId;
    private String transactionTypeName;
    private Boolean isSelected;
}
