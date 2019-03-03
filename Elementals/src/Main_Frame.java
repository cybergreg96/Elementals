import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Main_Frame extends JFrame {
	private Main_Panel suitePanel;

	public Main_Frame() {
		suitePanel = new Main_Panel();
		getContentPane().add(suitePanel);
	}

	public void start() {
		this.setSize(700, 700);
		this.setVisible(true);
	}

}
