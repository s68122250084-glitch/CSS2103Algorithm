package com.example.project;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.security.auth.Subject;

import static javafx.application.Application.launch;

public class Project extends Application {
    public void start(Stage stage) {

        GridPane pane = new GridPane();
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label midLabel = new Label("Midterm:");
        TextField midField = new TextField();



        Label finalLabel = new Label("Final:");
        TextField finalField = new TextField();


        Label hwLabel = new Label("Homework:");
        TextField hwField = new TextField();

        Label SumScore = new Label("Score");

        Label Status = new Label("Status");
        String text = hwField.getText();

        Label grade = new Label("Grade");
        String Grade ;



        ComboBox<String> Subject = new ComboBox<>();
        Subject.getItems().addAll("Math", "Sci", "Com", "Program");
        Subject.setValue("Math");

        TextArea resultArea = new TextArea();
        resultArea.setPrefHeight(120);
        resultArea.setPrefWidth(250);





        Button calculateBtn = new Button("Calculate");
        calculateBtn.setOnAction(e -> {
            double mid = Double.parseDouble(midField.getText());
            double fin = Double.parseDouble(finalField.getText());
            double hw = Double.parseDouble(hwField.getText());

            double total = mid + fin + hw;

            SumScore.setText("Score : " + total);

            if(total >= 80){
                grade.setText("A");
                Status.setText("PASS");
                Status.setStyle("-fx-text-fill: green;");
            }
            else if(total >= 70) {
                grade.setText("B");
                Status.setText("PASS");
                Status.setStyle("-fx-text-fill: green;");
            }

            else if(total >= 60) {
                grade.setText("C");
                Status.setText("PASS");
                Status.setStyle("-fx-text-fill: green;");
            }

            else if(total >= 50) {
                grade.setText("D");
                Status.setText("PASS");
                Status.setStyle("-fx-text-fill: green;");
            }
            else{
                grade.setText("F");
                Status.setText("FAIL");
                Status.setStyle("-fx-text-fill: red;");
            }

            resultArea.setText(Subject.getValue()+"  Score: "+total+"\n"+"Grade"+" "+grade.getText());

        });


        pane.add(calculateBtn, 0, 4);


        Button Reset = new Button("Reset");
        pane.add(Reset, 0, 5);

        Button Save = new Button("Save");
        pane.add(Save, 1, 5);

        Reset.setOnAction(e -> {
            midField.clear();
            finalField.clear();
            hwField.clear();
            Subject.setValue("Math");
            resultArea.clear();
        });

        Save.setOnAction(e -> {
            try {
                resultArea.setText("Save\n");
            } catch (Exception ex) {
                resultArea.setText("Save File Error");
            }
        });
        pane.add(midLabel,0,1);
        pane.add(midField,1,1);

        pane.add(finalLabel,0,2);
        pane.add(finalField,1,2);

        pane.add(hwLabel,0,3);
        pane.add(hwField,1,3);

        pane.add(Subject,1,0);

        pane.add(SumScore,0,6);
        pane.add(Status,1,6);

        pane.add(resultArea,0,7,2,1);
        Scene scene = new Scene(pane,400,400);
        stage.setTitle("Grade Calculator");
        stage.setScene(scene);
        stage.show();
    }
        public static void main(String[] args) {

            launch();

        }
    }