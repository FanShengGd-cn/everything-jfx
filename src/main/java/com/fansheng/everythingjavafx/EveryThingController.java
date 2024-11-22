package com.fansheng.everythingjavafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class EveryThingController implements Initializable {
    @FXML
    private TextField searchContent;

    @FXML
    private ScrollPane scrollP;

    @FXML
    private VBox vbox;

//    @FXML
//    public void menuShow(Object o){
//        System.out.println(o);
//    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ImageView imageView = new ImageView();
//        fitHeight="30.0" fitWidth="30.0" layoutX="7.0" layoutY="4.0" pickOnBounds="true" preserveRatio="true"
//        layoutX="45.0" layoutY="23.0" strokeType="OUTSIDE" strokeWidth="0.0"


        imageView.setImage(new Image(String.valueOf(this.getClass().getClassLoader().getResource("dir_img.png"))));

        imageView.setFitWidth(30);
        imageView.setFitHeight(30);
        imageView.setPreserveRatio(true);
        imageView.pickOnBoundsProperty().set(true);
        imageView.setLayoutX(7);
        imageView.setLayoutY(4);
        Pane pane = new Pane();
        Text text = new Text("C:\\Users\\Administrator\\Desktop\\project");
        text.setLayoutX(45);
        text.setLayoutY(23);
        text.setStrokeType(StrokeType.OUTSIDE);
        text.setStrokeWidth(0);
        pane.getChildren().add(imageView);
        pane.getChildren().add(text);
//        pane.getChildren().add(imageView);
        vbox.getChildren().add(pane);
        vbox.setOnKeyPressed(event -> {
            System.out.println(event.getCode());
        });
        searchContent.setOnKeyPressed(event -> {
            System.out.println(event.getCode());
        });
    }

    public void keyListener(Object o) {
        System.out.println(o);
    }
}