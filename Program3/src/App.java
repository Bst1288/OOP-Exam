import java.io.File;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        File vdo = new File("LoveShot.mp4");
        Media media = new Media(vdo.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);

        //create Button
        Button btPlay = new Button(">");
        Button btRewind = new Button("<<");

        //action Button
        btPlay.setOnAction(e -> {
            if(btPlay.getText().equals(">")){
                mediaPlayer.play();
                btPlay.setText("||");
            }
            else {
                mediaPlayer.pause();
                btPlay.setText(">");
            }
        });

        btRewind.setOnAction(e -> mediaPlayer.seek(Duration.ZERO));

        //Slider for control volume
        Slider slVolume = new Slider();
        slVolume.setPrefHeight(50);
        slVolume.setMaxWidth(Region.USE_PREF_SIZE);
        slVolume.setMinWidth(30);
        slVolume.setValue(50);

        mediaPlayer.volumeProperty().bind(slVolume.valueProperty().divide(100));

        Label lbVolume = new Label("Volume");
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(btPlay,btRewind,lbVolume,slVolume);

        BorderPane pane = new BorderPane();
        pane.setCenter(mediaView);
        pane.setBottom(hBox);

        Scene scene = new Scene(pane,700,500);
        primaryStage.setTitle("MediaDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }

}
