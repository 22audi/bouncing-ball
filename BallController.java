import javafx.animation.AnimationTimer;
import javafx.event.Event;
import javafx.event.EventHandler;

public class BallController extends AnimationTimer implements EventHandler{
	Ball ball;
	BallController(Ball ball){
	this.ball = ball;
	ball.circle.setOnKeyPressed(this);
	
	}
	@Override
	public void handle(long arg0) {
		ball.moveForward();
		ball.render();
		if(ball.isTouchingBottom()) ball.bounceUp();
		if(ball.isTouchingRight()) ball.bounceLeft();
		if(ball.isTouchingTop()) ball.bounceBottom();
		if(ball.isTouchingLeft()) ball.bounceRight();
	}

	@Override
	public void handle(Event arg0) {
		
		
		
		
	}

}
