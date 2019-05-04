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
	boolean isTouchingBottom() {
		if(ballY + ballRadius >= windowHeight) {
			return true;
		
		}
		return false;
	}
	void bounceUp() {
		yDirection = -1;
	}
	
	
	
	boolean isTouchingRight() {
		if(ballX + ballRadius >= windowWidth) {
			return true;
		
		}
		return false;
	}
	void bounceLeft() {
		xDirection = -1;
	}
	
	
	
	
	boolean isTouchingTop() {
		if(ballY - ballRadius <= 0) {
			return true;
		
		}
		return false;
	}
	void bounceBottom() {
		yDirection = 1;
	}
	
	
	
	
	boolean isTouchingLeft() {
		if(ballX -ballRadius <= 0) {
			return true;
		
		}
		return false;
	}
	void bounceRight() {
		xDirection = 1;
	}
	
	
	
	
	
	}

