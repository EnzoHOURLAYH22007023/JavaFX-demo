package com.example.td1;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Random;

public class Exercice2 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setResizable(false);

        // Création du conteneur principal
        GridPane root = new GridPane();
        root.setGridLinesVisible(true);

        // Création des cases du Tic Tac Toe
        Label case1= new Label();
        GridPane.setConstraints(case1, 0, 0);
        Label case2= new Label();
        GridPane.setConstraints(case2, 1, 0);
        Label case3= new Label();
        GridPane.setConstraints(case3, 2, 0);
        Label case4= new Label();
        GridPane.setConstraints(case4, 0, 1);
        Label case5= new Label();
        GridPane.setConstraints(case5, 1, 1);
        Label case6= new Label();
        GridPane.setConstraints(case6, 2, 1);
        Label case7= new Label();
        GridPane.setConstraints(case7, 0, 2);
        Label case8= new Label();
        GridPane.setConstraints(case8, 1, 2);
        Label case9= new Label();
        GridPane.setConstraints(case9, 2, 2);

        chargeImage(case1);
        chargeImage(case2);
        chargeImage(case3);
        chargeImage(case4);
        chargeImage(case5);
        chargeImage(case6);
        chargeImage(case7);
        chargeImage(case8);
        chargeImage(case9);

        root.getChildren().addAll(case1,case2,case3,case4,case5,case6,case7,case8,case9);

        // Ajout du conteneur à la scene
        Scene scene = new Scene(root);

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 300 );
        primaryStage.setHeight( 300 );
        primaryStage.setTitle("Tic Tac Toe");

        // Affichage de la fenêtre
        primaryStage.show();
    }

    public void chargeImage(Label label){
        // Création des image
        ImageView imageCroix = new ImageView("src/exercice2/Croix.png");
        ImageView imageRond = new ImageView("src/exercice2/Rond.png");
        ImageView imageVide = new ImageView("src/exercice2/Vide.png");
        // Attribution aléatoire des cases
        Random random = new Random();
        int nombre = random.nextInt(3);
        if(nombre == 0){
            label.setGraphic(imageCroix);
        } else if (nombre == 1){
            label.setGraphic(imageRond);
        } else {
            label.setGraphic(imageVide);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}