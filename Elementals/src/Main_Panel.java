import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;

@SuppressWarnings("serial")
public class Main_Panel extends JPanel implements KeyListener {
	private double x = 100;
	private double y = 100;
	private double velx = 0;
	private double vely = 0;
	
	public Main_Panel() {
		setBackground(Color.LIGHT_GRAY);
		setSize(500,500);	
		 this.addKeyListener(this);
		 this.setFocusable(true);
         this.requestFocusInWindow();
	}
	
	@Override
    public void paint(Graphics g) {
        super.paintComponent(g);  
        int n = 3;
        //Red Side
        g.setColor(Color.RED);
        g.fillRect(100, 50, 475, 240);   
        int [] tx3 = {100, 100 ,50};
        int [] ty3 = {50 ,290, 290};   
        int [] tx4 = {575, 575 ,625};
        int [] ty4 = {290 ,50, 290};
        Polygon t3 = new Polygon(tx3, ty3, n); 
        Polygon t4 = new Polygon(tx4, ty4, n); 
        g.fillPolygon(t3);
        g.fillPolygon(t4);
        //Blue Side
        g.setColor(Color.BLUE);
        g.fillRect(100, 290, 475, 240);
        int [] tx1 = {100, 100 ,50};
        int [] ty1 = {290 ,530, 290};        
        int [] tx2 = {575, 575 ,625};
        int [] ty2 = {290 ,530, 290};
        Polygon t1 = new Polygon(tx1, ty1, n); 
        Polygon t2 = new Polygon(tx2, ty2, n);   
        g.fillPolygon(t1);
        g.fillPolygon(t2);
        
        g.setColor(Color.BLACK);
        Graphics2D g2 = (Graphics2D)g;
        g2.fill(new Ellipse2D.Double(x, y, 20, 20));
        
    }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void actionPerformed(ActionEvent e){
		repaint();
		x+=velx;
		y+=vely;
	}
	public void up(){
		vely = -1.5;
		velx = 0;
	}
	public void down(){
		vely = 1.5;
		velx = 0;
	}
	public void left(){
		velx = -1.5;
		vely = 0;
	}
	public void right(){
		velx = -1.5;
		vely = 0;
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar()=='d'){
			x += 2;
		}
		else if(e.getKeyChar()=='a'){
			x -= 2;
		}
		else if(e.getKeyChar()=='w'){
			y -= 2;
		}
		else if(e.getKeyChar()=='s'){
			y += 2;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
