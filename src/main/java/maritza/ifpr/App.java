package maritza.ifpr;

import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        // root.setStyle("-fx-background-color: green");

        Text enunciado = new Text("Enunciado");
        root.getChildren().add(enunciado);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10.0);

        Button alternativa1 = new Button("Alternativa 1");
        root.getChildren().add(alternativa1);

        alternativa1.setOnAction(this::respondeQuestao);

        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.show();
    }

    private void respondeQuestao(Event event) {
        System.out.println("EU CLIQUEI NESSE BOTÃO");
    }

    public static void main(String[] args) {
        launch();
    }

}