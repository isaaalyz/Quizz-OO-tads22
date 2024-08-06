package maritza.ifpr;

import java.util.ArrayList;

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

    private ControladorQuiz controladorQuiz;


    @Override
    public void init() throws Exception {
        super.init();

        ArrayList<Questao> lista = new ArrayList<>();

        lista.add(new Questao("Qual a cor favorita da prof?", "rosa",
                new String[] { "preto", "laranja", "roxo", "vermelho" }));
        lista.add(new Questao("Qual a cor favorita da prof 2?", "verde",
                new String[] { "preto", "laranja", "roxo", "vermelho" }));
        lista.add(new Questao("Qual a cor favorita da prof? 3", "azul",
                new String[] { "preto", "laranja", "roxo", "vermelho" }));
        lista.add(new Questao("Qual a cor favorita da prof? 4", "cinza",
                new String[] { "preto", "laranja", "roxo", "vermelho" }));
        lista.add(new Questao("Qual a cor favorita da prof? 5", "marrom",
                new String[] { "preto", "laranja", "roxo", "vermelho" }));

        controladorQuiz = new ControladorQuiz(lista);

    }

    @Override
    public void start(Stage stage) throws Exception {

        VBox root = new VBox();
        // root.setStyle("-fx-background-color: green");

        Questao questao = this.controladorQuiz.getQuestao();

        Text enunciado = new Text(questao.getEnunciado());
        root.getChildren().add(enunciado);
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10.0);

        Button alternativa1 = new Button(questao.getTodasAlternativas().get(0));
        root.getChildren().add(alternativa1);
        Button alternativa2 = new Button(questao.getTodasAlternativas().get(1));
        root.getChildren().add(alternativa2);
        Button alternativa3 = new Button(questao.getTodasAlternativas().get(2));
        root.getChildren().add(alternativa3);
        Button alternativa4 = new Button("Alternativa 4");
        root.getChildren().add(alternativa4);
        Button alternativa5 = new Button("Alternativa 5");
        root.getChildren().add(alternativa5);

        alternativa1.setOnAction(this::respondeQuestao);

        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.show();
    }

    private void respondeQuestao(Event event) {
        System.out.println("EU CLIQUEI NESSE BOTÃO");
    }

    public static void main(String[] args) {
        launch(args);
    }

}