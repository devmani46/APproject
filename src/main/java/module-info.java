module com.example.quiz1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.quiz1 to javafx.fxml;
    exports com.example.quiz1;
}