module com.example.ct_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ct_1 to javafx.fxml;
    exports com.example.ct_1;
}