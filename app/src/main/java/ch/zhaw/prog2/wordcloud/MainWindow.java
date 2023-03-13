package ch.zhaw.prog2.wordcloud;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainWindow extends Application {


    public void openMainWindow(Stage stage) {
        stage.show();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        openMainWindow(primaryStage);
    }
}
