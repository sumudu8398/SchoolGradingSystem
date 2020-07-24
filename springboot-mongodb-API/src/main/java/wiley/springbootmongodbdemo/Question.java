package wiley.springbootmongodbdemo;

import java.util.List;

public class Question extends Assignment {
    private String questionNumber;
    private boolean answer;
    private double time;

    public Question(String questionNumber, boolean answer, double time) {
        this.questionNumber = questionNumber;
        this.answer = answer;
        this.time = time;
    }

    public Question(String assigmentID, String moduleName, List<Question> questions, String questionNumber, boolean answer, double time) {
        super(assigmentID, moduleName, questions);
        this.questionNumber = questionNumber;
        this.answer = answer;
        this.time = time;
    }

    public String getQuestionNumber() {
        return questionNumber;
    }

    public boolean isAnswer() {
        return answer;
    }

    public double getTime() {
        return time;
    }
}
