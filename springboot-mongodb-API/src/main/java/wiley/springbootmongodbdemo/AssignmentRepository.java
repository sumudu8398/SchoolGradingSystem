package wiley.springbootmongodbdemo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AssignmentRepository extends MongoRepository<Assignment,String> {


}
