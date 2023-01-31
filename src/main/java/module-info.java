module ehu.eus.presentation.lab01 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens ehu.eus.presentation.lab01 to javafx.fxml;
    exports ehu.eus.presentation.lab01;
}