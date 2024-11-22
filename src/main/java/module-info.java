module com.fansheng.everythingjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires jintellitype;
    requires java.desktop;


    opens com.fansheng.everythingjavafx to javafx.fxml;
    exports com.fansheng.everythingjavafx;
}