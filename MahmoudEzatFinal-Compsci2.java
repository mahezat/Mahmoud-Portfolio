package com.example.ezatlab14;
//import statements
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

public class EzatLab14 extends Application {
   // image statements with path included
    Image penny1 = new Image("file:D:\\EzatLab14\\src\\main\\java\\com\\example\\ezatlab14\\Penny.png");
    ImageView penny = new ImageView(penny1);
    Image nickel1 = new Image("file:D:\\EzatLab14\\src\\main\\java\\com\\example\\ezatlab14\\Nickel.png");
    ImageView nickel = new ImageView(nickel1);
    Image dime1 = new Image("file:D:\\EzatLab14\\src\\main\\java\\com\\example\\ezatlab14\\Dime.png");
    ImageView dime= new ImageView(dime1);
    Image quarter1 = new Image("file:D:\\EzatLab14\\src\\main\\java\\com\\example\\ezatlab14\\Quarter.png");
    ImageView quarter = new ImageView(quarter1);
    Image halfdollar1 = new Image("file:D:\\EzatLab14\\src\\main\\java\\com\\example\\ezatlab14\\HalfDollar.png");
    ImageView halfdollar = new ImageView(halfdollar1);
    //double coin placeholders
    double pennyA = 0;
    double nickelA = 0;
    double dimeA = 0;
    double quarterA = 0;
    double halfdA = 0;
    double totalCoin = 0;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //@param primarystage; the primary stage for the program
        primaryStage.setTitle("Coin Selection Game"); // set stage title
        Label q1 = new Label("Pick the coins that will add to a dollar, then click this statement to calculate");   // label for game

        HBox label = new HBox(q1); // label hbox
        HBox coins = new HBox(penny, nickel, dime, quarter, halfdollar); // coin hbox
        VBox view = new VBox(label, coins); // vbox for the hboxes



        q1.setOnMouseClicked(mouseEvent -> { // label changing mouse event code
            if (totalCoin == 1) {
                q1.setText(String.format("You have chosen the correct coins! Your amount is %.2f" +
                                " click the coins to play again!", totalCoin));
            } else {
                    q1.setText("You have clicked the wrong coins! Try again!");

                    }
                    totalCoin = 0;
                });




    // mouse event block for each coin in the game
        penny.setOnMouseClicked(event ->
        {
           totalCoin =  totalCoin +.01;
        });
        nickel.setOnMouseClicked(mouseEvent ->{
            totalCoin =  totalCoin +.05;
        });
        dime.setOnMouseClicked(mouseEvent ->{
            totalCoin =  totalCoin +.1;
        });
        quarter.setOnMouseClicked(mouseEvent ->{
            totalCoin =  totalCoin +.25;
        });
        halfdollar.setOnMouseClicked(mouseEvent ->{
            totalCoin =  totalCoin +.50;
        });


    Scene scene = new Scene(view, 200, 200); // creating the scene
    primaryStage.setScene(scene);// setting scene
    primaryStage.show();// show code



                }
            }

