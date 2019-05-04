import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.stage.Stage;

public class BouncingBallApp extends Application {
	final int WIDTH = 700;
	final int HEIGHT = 500;
	Ball ball;
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Bouncing Ball");
		Group root = new Group();
		Scene scene = new Scene(root, WIDTH, HEIGHT);
		stage.setScene(scene);
		stage.show();
		ball = new Ball(WIDTH, HEIGHT);
		BallController controller = new BallController(ball);
		root.getChildren().add(ball.circle);
		controller.start();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
