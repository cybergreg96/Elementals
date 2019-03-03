import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;

@SuppressWarnings("serial")
public class Elemental1 extends JPanel implements KeyListener {
	private double x = 100;
	private double y = 100;
	private double velx = 0;
	private double vely = 0;
	private int health;

	public Elemental1() {
		this.addKeyListener(this);
		health = 100;

	}

	public int getHealth() {
		return health;
	}

	@Override
	public void paint(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		Graphics2D g2 = (Graphics2D) g;
		g2.fill(new Ellipse2D.Double(x, y, 20, 20));

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void actionPerformed(ActionEvent e) {
		repaint();
		x += velx;
		y += vely;
	}

	public void up() {
		vely = -1.5;
		velx = 0;
	}

	public void down() {
		vely = 1.5;
		velx = 0;
	}

	public void left() {
		velx = -1.5;
		vely = 0;
	}

	public void right() {
		velx = -1.5;
		vely = 0;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyChar() == 'd') {
			x += 2;
		} else if (e.getKeyChar() == 'a') {
			x -= 2;
		} else if (e.getKeyChar() == 'w') {
			y -= 2;
		} else if (e.getKeyChar() == 's') {
			y += 2;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
