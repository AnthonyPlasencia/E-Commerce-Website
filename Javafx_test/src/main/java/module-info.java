module com.example.javafx_test {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_test to javafx.fxml;
    exports com.example.javafx_test;
}