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
public class Tab3 extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Tab3()
	{
		this.add(new JButton("lol"));
	}
	

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		BufferedImage tmp;
		try {
			tmp = ImageIO
					.read(new URL(
							"http://a3.mzstatic.com/us/r1000/119/Purple/f7/69/4d/mzl.ieyvmcij.800x500-75.jpg"));
		g.drawImage(tmp, 0, 0, getWidth(), getHeight(),
				null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
