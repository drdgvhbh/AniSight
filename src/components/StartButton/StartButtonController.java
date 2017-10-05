package components.StartButton;

import components.AbstractController;
import components.Model;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;

public class StartButtonController extends AbstractController {
    @FXML
    private Button startButton;

    @Override
    public void initModel(Model model) throws IllegalStateException {
        super.initModel(model);

        startButton.setOnAction((event -> {

        }));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}