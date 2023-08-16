package ee.bank.back.domain.location.transactiontype;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class TransactionTypeService {

    @Resource
    private TransactionTypeRepository transactionTypeRepository;
    public TransactionType findTransactionTypeBy(Integer transactionTypeId) {
        return transactionTypeRepository.findById(transactionTypeId).get();

    }
}
