import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Main_Panel extends JPanel {
	Arena a = new Arena();
	Elemental1 Ef = new Elemental1();

	public Main_Panel() {
		setBackground(Color.LIGHT_GRAY);
		setSize(500, 500);
		this.setFocusable(true);
		this.requestFocusInWindow();
		System.out.println(Ef.getHealth());
	}

	public void paint(Graphics g) {
		a.paint(g);
		Ef.paint(g);
	}

}
