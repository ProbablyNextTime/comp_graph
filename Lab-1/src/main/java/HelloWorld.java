import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.shape.*;

public class HelloWorld extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();

        Polygon shipHull = new Polygon(
                100, 235,
                240, 370,
                430, 370,
                540, 235,
                400, 290,
                250, 290);
        shipHull.setFill(Color.rgb(132,68,4));

        Rectangle mast = new Rectangle(320, 220, 15, 70);
        mast.setFill(Color.rgb(4, 4, 4));

        Polygon sail = new Polygon(
                230, 213,
                410, 230,
                370, 130,
                400, 30,
                260, 30,
                210, 130);
        sail.setFill(Color.rgb(196, 196, 196));


        root.getChildren().add(shipHull);
        root.getChildren().add(mast);
        root.getChildren().add(sail);

        Scene scene = new Scene(root, 600, 400);
        scene.setFill(Color.rgb(255, 252, 128));


        primaryStage.setTitle("Lab1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}