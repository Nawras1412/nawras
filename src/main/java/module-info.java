module il.ac.haifa.gitexample {
    requires javafx.controls;
    requires javafx.fxml;

    opens il.ac.haifa.gitexample to javafx.fxml;
    exports il.ac.haifa.gitexample;
}