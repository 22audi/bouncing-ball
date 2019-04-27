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
	}

	@Override
	public void handle(Event arg0) {
		
		
		
		
	}

}
