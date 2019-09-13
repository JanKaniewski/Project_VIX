package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class Main extends Application {


    public static void main(String[] args) {
           launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(this.getClass().getResource("sample.fxml"));

        AnchorPane anchorPane = loader.load();
        Scene scene = new Scene(anchorPane);

        Controller controller = loader.getController();
        controller.setStage(primaryStage);
        primaryStage.setTitle("VIX Spread");
        primaryStage.setScene(scene);
        primaryStage.show();
        }

}
