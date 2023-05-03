package com.example.td1;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Exercice1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Création du conteneur principal
        BorderPane root = new BorderPane();

        // Création du conteneur correspondant a la barre de Menu
        HBox topControls = new HBox();
        topControls.setAlignment( Pos.BOTTOM_LEFT );

        // Création du Menu File
        Menu menu1 = new Menu("File");
        MenuItem menuItemNew = new MenuItem("New");
        MenuItem menuItemOpen = new MenuItem("Open");
        MenuItem menuItemSave = new MenuItem("Save");
        MenuItem menuItemClose = new MenuItem("Close");
        menu1.getItems().addAll(menuItemNew,menuItemOpen,menuItemSave,menuItemClose);

        // Création du Menu Options
        Menu menu2 = new Menu("Options");
        MenuItem menuItemCut = new MenuItem("Cut");
        MenuItem menuItemCopy = new MenuItem("Copy");
        MenuItem menuItemPaste = new MenuItem("Paste");
        menu2.getItems().addAll(menuItemCut,menuItemCopy,menuItemPaste);

        //Création du Menu Help
        Menu menu3 = new Menu("Help");
        MenuBar menuBar = new MenuBar(menu1,menu2,menu3);

        topControls.getChildren().add(menuBar);
        root.setTop(topControls);

        // Création du conteneur correspondant aux trois bouton a gauche
        HBox leftControls = new HBox();

        VBox leftLeftControls = new VBox();
        leftLeftControls.setAlignment( Pos.CENTER );
        Label labelBtn = new Label("Boutons :");
        Button btn1 = new Button("Bouton 1");
        Button btn2 = new Button("Bouton 2");
        Button btn3 = new Button("Bouton 3");
        leftLeftControls.getChildren().addAll(labelBtn,btn1,btn2,btn3);

        HBox leftRightControls = new HBox();
        Separator separator = new Separator(Orientation.VERTICAL);
        VBox.setVgrow(leftRightControls, Priority.ALWAYS );
        leftRightControls.getChildren().add(separator);

        leftControls.getChildren().addAll(leftLeftControls,leftRightControls);
        root.setLeft(leftControls);

        // Création du conteneur correspondant au formulaire
        GridPane centerControls = new GridPane();
        centerControls.setAlignment( Pos.CENTER );
        GridPane.setMargin( centerControls, new Insets(0.0d, 10.0d, 10.0d, 10.0d));

        Label nameLabel = new Label("Name:");
        GridPane.setConstraints(nameLabel, 0, 0);
        var nameField = new TextField();
        GridPane.setConstraints(nameField, 1, 0);

        Label emailLabel = new Label("Email:");
        GridPane.setConstraints(emailLabel, 0, 1);
        var emailField = new TextField();
        GridPane.setConstraints(emailField, 1, 1);

        Label passwordLabel = new Label("Password:");
        GridPane.setConstraints(passwordLabel, 0, 2);
        var passwordField = new TextField();
        GridPane.setConstraints(passwordField, 1, 2);

        Button btnSubmit = new Button("Submit");
        GridPane.setConstraints(btnSubmit, 0, 3);
        Button btnCancel = new Button("Cancel");
        GridPane.setConstraints(btnCancel, 1, 3);

        centerControls.getChildren().addAll(
                nameLabel,nameField,
                emailLabel,emailField,
                passwordLabel,passwordField,
                btnSubmit,btnCancel
        );
        root.setCenter(centerControls);

        // Création du bandeau en bas de la fenêtre
        VBox bottomControls = new VBox();
        bottomControls.setAlignment( Pos.CENTER );
        Separator bottomSeparator = new Separator();
        Label bottomLabel = new Label("Ceci est un label de bas de page");

        bottomControls.getChildren().addAll(bottomSeparator,bottomLabel);
        root.setBottom(bottomControls);

        //VBox.setMargin( tblCustomers, new Insets(0.0d, 10.0d, 10.0d, 10.0d) )

        // Ajout du conteneur à la scene
        Scene scene = new Scene(root);

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 600 );
        primaryStage.setHeight( 500 );
        primaryStage.setTitle("Premier exemple manipulant les conteneurs");

        // Affichage de la fenêtre
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}