package de.wandang.git.d2a;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 
 * @author Sinthowinto
 * 
 */
public class Tab1 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Tab1() {
		super();
		this.add(new JButton("Button 1"));
		this.add(new JButton("Button 2"));
		this.add(new JButton("Button 3"));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		BufferedImage tmp;
		try {
			tmp = ImageIO
					.read(new URL(
							"http://img823.imageshack.us/img823/7631/ckedm.jpg"));
		g.drawImage(tmp, 0, 0, getWidth(), getHeight(),
				null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
