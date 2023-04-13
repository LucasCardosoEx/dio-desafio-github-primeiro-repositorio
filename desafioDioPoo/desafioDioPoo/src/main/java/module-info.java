module com.dio.desafio.desafiodiopoo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dio.desafio.desafiodiopoo to javafx.fxml;
    exports com.dio.desafio.desafiodiopoo;
}