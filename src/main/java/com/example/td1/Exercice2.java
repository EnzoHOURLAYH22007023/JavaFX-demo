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
        // Création des image
        ImageView imageCroix = new ImageView("exercice2/Croix.png");
        ImageView imageRond = new ImageView("exercice2/Rond.png");
        ImageView imageVide = new ImageView("exercice2/Vide.png");

        // Attribution aléatoire des cases
        Random random = new Random();
        int nombre = random.nextInt(3);

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

    public static void main(String[] args) {
        launch(args);
    }
}