package de.wandang.git.d2a;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author Sinthowinto
 * 
 */
public class Tab2 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Tab2() {
		super();
		this.add(new JTextField("TextField", 20));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		BufferedImage tmp;
		try {
			tmp = ImageIO
					.read(new URL(
							"http://2.bp.blogspot.com/-mlmIhUvn22s/TaUE0U3OQ1I/AAAAAAAAAEk/h-1K_WOEn3Q/s1600/Clinkz.jpg"));
		g.drawImage(tmp, 0, 0, getWidth(), getHeight(),
				null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
