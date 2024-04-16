package all.repository;

import all.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends CrudRepository<Users, Long> {
}
