module dio.webapi {
    requires javafx.controls;
    requires javafx.fxml;


    opens dio.webapi to javafx.fxml;
    exports dio.webapi;
}