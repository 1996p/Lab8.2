module ru.vorotov.simulationslab82 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.vorotov.simulationslab82 to javafx.fxml;
    exports ru.vorotov.simulationslab82;
}