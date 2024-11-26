module com.fansheng.everythingjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires jintellitype;
    requires com.sun.jna;
    requires javafx.swing;

    opens com.fansheng.everythingjavafx to javafx.fxml;
    exports com.fansheng.everythingjavafx;
}