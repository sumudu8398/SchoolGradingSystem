package wiley.springbootmongodbdemo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@Document(collection = "Assignments")
public class Assignment {
    @Id
    private String assigmentID;
    private String moduleName;
    private List<Question> questions;

    protected Assignment(){
        this.questions=new ArrayList<>();
    }

    public Assignment(String assigmentID, String moduleName, List<Question> questions) {
        this.assigmentID = assigmentID;
        this.moduleName = moduleName;
        this.questions = questions;
    }

    public String getAssigmentID() {
        return assigmentID;
    }

    public String getModuleName() {
        return moduleName;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
