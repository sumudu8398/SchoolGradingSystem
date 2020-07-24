package wiley.springbootmongodbdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {
    private AssignmentRepository assignmentRepository;


    public DbSeeder(AssignmentRepository assignmentRepository){
        this.assignmentRepository=assignmentRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        Assignment assignment=new Assignment("101","Programming principle",
                Arrays.asList(new Question("1",true,1.50),new Question("2",false,1.00))) ;

        Assignment assignment1=new Assignment(
                "103","Web Design",Arrays.asList(new Question("1",true,1.0)
        ,new Question("2",true,3.25),
                new Question("3",false,2.65),
                new Question("4",true,5.00))
        );

        // drop all records
        this.assignmentRepository.deleteAll();

        //add record to database

        List<Assignment> assignments=Arrays.asList(assignment,assignment1);
        this.assignmentRepository.saveAll(assignments);



    }
}
