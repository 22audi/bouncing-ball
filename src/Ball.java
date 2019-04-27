import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Ball {
	double ballRadius = 20;
	double ballX = 100;
	double ballY = 200;
	double xSpeed = 5;
	double ySpeed = 5;
	int xDirection = 1;
	int yDirection = 1;
	int windowWidth;
	int windowHeight;
	Circle circle;
	Ball(int width, int height){
		circle = new Circle();
		circle.setCenterX(ballX);
		circle.setCenterY(ballY);
		circle.setRadius(ballRadius);
		circle.setFill(Color.BLUE);
		circle.setFocusTraversable(true);
		windowWidth = width;
		windowHeight = height;
		
		}
	void render() {
		circle.setCenterX(ballX);
		circle.setCenterY(ballY);	
		
		
	}
	void moveForward() {
		ballX += (xSpeed * xDirection);
		ballY += (ySpeed * yDirection);
	}
	
	
	
	
	
	
	
	
	}

