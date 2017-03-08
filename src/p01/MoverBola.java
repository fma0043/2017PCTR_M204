package p01;

/**
 * 
 * @author eduardo y felix Clase auxiliar para poder mover y hacer que la bola
 *         rebote.
 */
public class MoverBola extends Thread {

	private Board board;
	private Ball ball;

	public MoverBola(Ball ball, Board board) {
		this.ball = ball;
		this.board = board;
	}

	public void run() {
		try {
			while (true) {
				this.ball.move();
				this.ball.reflect();
				board.repaint();
				Thread.sleep(10);
			}
		} catch (InterruptedException a) {
			return;
		}
	}
}
