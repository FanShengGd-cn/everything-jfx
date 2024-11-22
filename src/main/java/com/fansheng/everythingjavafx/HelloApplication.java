package com.fansheng.everythingjavafx;

import com.melloware.jintellitype.HotkeyListener;
import com.melloware.jintellitype.JIntellitype;
import com.melloware.jintellitype.JIntellitypeConstants;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    JIntellitype jIntellitype = JIntellitype.getInstance();

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("everything-fxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        HotkeyListener hotkeyListener = i -> {
            switch (i) {
                case 1: {
                    if(stage.isShowing()){
                        Platform.runLater(stage::hide);
                    }else{
                        Platform.runLater(stage::show);
                    }
                    break;
                }
            }
        };

        jIntellitype.registerHotKey(1, JIntellitypeConstants.MOD_ALT, 32);
        jIntellitype.addHotKeyListener(hotkeyListener);
    }

    public static void main(String[] args) {
        launch();
    }
}