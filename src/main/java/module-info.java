module com.example.chekers {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chekers to javafx.fxml;
    exports com.example.chekers;
}