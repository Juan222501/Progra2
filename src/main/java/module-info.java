module co.edu.uniquindio.gestordecontactos {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.gestordecontactos to javafx.fxml;
    exports co.edu.uniquindio.gestordecontactos;
    exports co.edu.uniquindio.gestordecontactos.Model;
    opens co.edu.uniquindio.gestordecontactos.Model to javafx.fxml;
}