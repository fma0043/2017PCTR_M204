package p01;
/**
 * 
 * @author eduardo y felix
 * Clase auxiliar para poder mover y hacer que la bola rebote.
 */
public class MoverBola implements Runnable {

	private Board board;
	private Ball ball;
	
	public MoverBola(Ball ball){
		this.ball=ball;
	}
	
	public void run() {
		this.ball.move();
		this.ball.reflect();
		board.repaint();
	}
}
