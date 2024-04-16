package all.repository;

import all.entity.Stars;
import all.entity.Stars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface StarRepository extends CrudRepository<Stars, Long> {
}
