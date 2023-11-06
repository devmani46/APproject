package com.example.quiz1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class QuizController {

    @FXML
    public Label question;


    @FXML
    public Button opt1,opt2,opt3,opt4;

    @FXML
    private Button confirmButton;

    int counter = 0;
    static int correct =0;
    static int wrong = 0;



    @FXML
    private void initialize(){
        loadQuestions();

    }



    private void loadQuestions() {

        if(counter ==0){
            question.setText("1. Question no 1:");
            opt1.setText("number 1");
            opt2.setText("number 2");
            opt3.setText("number 3");
            opt4.setText("number 4");
        }
        else if(counter ==1){
            question.setText("2. Question no 2:");
            opt1.setText("number 1");
            opt2.setText("number 2");
            opt3.setText("number 3");
            opt4.setText("number 4");
        }
        else if(counter ==2){
            question.setText("3. Question no 3:");
            opt1.setText("number 1");
            opt2.setText("number 2");
            opt3.setText("number 3");
            opt4.setText("number 4");
        }
        else if(counter ==3){
            question.setText("4. Question no 4:");
            opt1.setText("number 1");
            opt2.setText("number 2");
            opt3.setText("number 3");
            opt4.setText("number 4");
        }
        else if(counter ==4){
            question.setText("5. Question no 5:");
            opt1.setText("number 1");
            opt2.setText("number 2");
            opt3.setText("number 3");
            opt4.setText("number 4");
        }
        else if(counter ==5){
            question.setText("6. Question no 6:");
            opt1.setText("number 1");
            opt2.setText("number 2");
            opt3.setText("number 3");
            opt4.setText("number 4");
        }
        else if(counter ==6){
            question.setText("7. Question no 7:");
            opt1.setText("number 1");
            opt2.setText("number 2");
            opt3.setText("number 3");
            opt4.setText("number 4");
        }
        else if(counter ==7){
            question.setText("8. Question no 8:");
            opt1.setText("number 1");
            opt2.setText("number 2");
            opt3.setText("number 3");
            opt4.setText("number 4");
        }
        else if(counter ==8){
            question.setText("9. Question no 9:");
            opt1.setText("number 1");
            opt2.setText("number 2");
            opt3.setText("number 3");
            opt4.setText("number 4");
        }
        else if(counter ==9){
            question.setText("10. Question no 10:");
            opt1.setText("number 1");
            opt2.setText("number 2");
            opt3.setText("number 3");
            opt4.setText("number 4");
        }
    }

    @FXML
    public void opt1clicked(ActionEvent event){
        checkAnswer(opt1.getText().toString());
        if (checkAnswer(opt1.getText().toString())){
            correct = correct + 1;
        }else {
            wrong = wrong + 1;
        }


        if (counter ==9){
            try{
                Stage thisStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisStage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);

                stage.show();

            }catch (Exception e){
                e.printStackTrace();
            }

        }else{
            counter++;
            loadQuestions();
        }

    }

    boolean checkAnswer(String answer) {
        if(counter == 0){
            if(answer.equals("number 1")){
                return true;
            }else{
                return false;
            }
        }
        if(counter == 1){
            if(answer.equals("number 2")){
                return true;
            }else{
                return false;
            }
        }
        if(counter == 2){
            if(answer.equals("number 3")){
                return true;
            }else{
                return false;
            }
        }
        if(counter == 3){
            if(answer.equals("number 4")){
                return true;
            }else{
                return false;
            }
        }
        if(counter == 4){
            if(answer.equals("number 1")){
                return true;
            }else{
                return false;
            }
        }
        if(counter == 5){
            if(answer.equals("number 2")){
                return true;
            }else{
                return false;
            }
        }
        if(counter == 6){
            if(answer.equals("number 3")){
                return true;
            }else{
                return false;
            }
        }
        if(counter == 7){
            if(answer.equals("number 4")){
                return true;
            }else{
                return false;
            }
        }
        if(counter == 8){
            if(answer.equals("number 1")){
                return true;
            }else{
                return false;
            }
        }
        if(counter == 9){
            if(answer.equals("number 2")){
                return true;
            }else{
                return false;
            }
        }
        return false;

    }

    @FXML
    public void opt2clicked(ActionEvent event){
        checkAnswer(opt2.getText().toString());
        if (checkAnswer(opt2.getText().toString())){
            correct = correct + 1;
        }else {
            wrong = wrong + 1;
        }


        if (counter ==9){
            try{
                Stage thisStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisStage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);

                stage.show();

            }catch (Exception e){
                e.printStackTrace();
            }

        }else{
            counter++;
            loadQuestions();
        }

    }

    @FXML
    public void opt3clicked(ActionEvent event){
        checkAnswer(opt3.getText().toString());
        if (checkAnswer(opt3.getText().toString())){
            correct = correct + 1;
        }else {
            wrong = wrong + 1;
        }


        if (counter ==9){
            try{
                Stage thisStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisStage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);

                stage.show();

            }catch (Exception e){
                e.printStackTrace();
            }

        }else{
            counter++;
            loadQuestions();
        }
    }

    @FXML
    public void opt4clicked(ActionEvent event){
        checkAnswer(opt4.getText().toString());
        if (checkAnswer(opt4.getText().toString())){
            correct = correct + 1;
        }else {
            wrong = wrong + 1;
        }


        if (counter ==9){
            try{
                Stage thisStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisStage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);

                stage.show();

            }catch (Exception e){
                e.printStackTrace();
            }

        }else{
            counter++;
            loadQuestions();
        }
    }

    @FXML
    public void confirmClicked(ActionEvent event) {


        if (counter == 9) {
            try {
                Stage thisStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisStage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.initStyle(StageStyle.TRANSPARENT);
                scene.setFill(Color.TRANSPARENT);

                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }
}



