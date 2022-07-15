package jana60.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import jana60.model.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {

  List<Department> findAllByOrderByName();

  List<Department> findAllByOrderByNameDesc();
}
