import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

@SuppressWarnings("serial")
public class Arena extends JPanel {

	public Arena() {

	}

	@Override
	public void paint(Graphics g) {
		super.paintComponent(g);
		int n = 3;
		// Red Side
		g.setColor(Color.RED);
		g.fillRect(100, 50, 475, 240);
		int[] tx3 = { 100, 100, 50 };
		int[] ty3 = { 50, 290, 290 };
		int[] tx4 = { 575, 575, 625 };
		int[] ty4 = { 290, 50, 290 };
		Polygon t3 = new Polygon(tx3, ty3, n);
		Polygon t4 = new Polygon(tx4, ty4, n);
		g.fillPolygon(t3);
		g.fillPolygon(t4);
		// Blue Side
		g.setColor(Color.BLUE);
		g.fillRect(100, 290, 475, 240);
		int[] tx1 = { 100, 100, 50 };
		int[] ty1 = { 290, 530, 290 };
		int[] tx2 = { 575, 575, 625 };
		int[] ty2 = { 290, 530, 290 };
		Polygon t1 = new Polygon(tx1, ty1, n);
		Polygon t2 = new Polygon(tx2, ty2, n);
		g.fillPolygon(t1);
		g.fillPolygon(t2);
	}
}
