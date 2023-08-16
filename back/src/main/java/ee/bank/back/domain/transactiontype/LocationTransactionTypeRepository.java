package ee.bank.back.domain.transactiontype;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationTransactionTypeRepository extends JpaRepository<LocationTransactionType, Integer> {
}