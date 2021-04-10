package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    //Саня те надо через меню file/project structure устанвоить путь к sdk javafx в пункте librares
    // а так же путь к jdk15.0.2 в пункте SDKs
    // он у тебя гдет должен быть а если небудет то там есть пункт install во
    // � ����� &
}
