package com.example.quiz1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;

public class ResultController {
    @FXML
    public Label result,marks,remark,markText,correctText,wrongText;

    @FXML
    public ProgressIndicator correctProgress,wrongProgress;

    @FXML
    private void initialize(){
        markText.setText("Marks Obtained: " + String.valueOf(QuizController.correct));
        correctText.setText("Correct Answers: " + String.valueOf(QuizController.correct));
        wrongText.setText("Incorrect Answers: " + String.valueOf(QuizController.wrong));


        marks.setText(QuizController.correct + "/10");
//        markText.setText(QuizController.correct + "/10");

        float correctf = (float) QuizController.correct/10;
        correctProgress.setProgress(correctf);

        float wrongf = (float) QuizController.wrong/10;
        wrongProgress.setProgress(wrongf);


        int correct = QuizController.correct;

        if(correct<=2){
            remark.setText("FAILED");
        } else if (correct>2 && correct<5) {
            remark.setText("Barely FAILED");
        } else if (correct>=5 && correct <8) {
            remark.setText("PASSED");
        } else if (correct==10) {
            remark.setText("FULL MARKS!");
        } else{
            remark.setText("GOOD JOB");

        }
    }
}
