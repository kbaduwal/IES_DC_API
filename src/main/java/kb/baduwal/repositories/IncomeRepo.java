package kb.baduwal.repositories;

import kb.baduwal.entities.IncomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepo extends JpaRepository<IncomeEntity, Integer> {
}
