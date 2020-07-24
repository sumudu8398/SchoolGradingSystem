package wiley.springbootmongodbdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/assignments")
public class AssignmentController {
    private AssignmentRepository assignmentRepository;



    public AssignmentController(AssignmentRepository assignmentRepository){
        this.assignmentRepository=assignmentRepository;
    }




    @GetMapping("/all")
    public List<Assignment>getAll(){
        List<Assignment>assignments=this.assignmentRepository.findAll();

        return assignments;
    }



}
