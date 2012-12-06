package de.wandang.git.d2a;

/*
 * Bilder werden aus Internet geladen, sollten lokal gespeichert werden,
 * mit in jar Datei -> passende Bilder auswählen,
 * evtl. Möglichkeit für eigene Bilder als Hintergrund?
 */


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 * GUI fuer einen Settingsmanager fuer Dota 2
 * 
 * @author Sinthowinto
 * 
 */
public class GUI extends JFrame
{

	/**
	 * default UID
	 */
	private static final long serialVersionUID = 1L;

	// the game panel
	private Settingpanel Settings;

	// label for messages
	private JLabel output;
	
/*
	// for the dialogwindow
	private JDialog d;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
*/
	
	public GUI()
	{
		// create Frame
		super("Settings");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// create Labels
		output = new JLabel("Settings");
		output.setHorizontalAlignment(JLabel.CENTER);
		output.setForeground(Color.white);
		// create Panels
		Settings = new Settingpanel();
		// Menubar into Frame
		setJMenuBar(this.createMenuBar());

		// get the Panels on the Frame
		add(BorderLayout.CENTER, Settings);
		// frame should not be resizable
		setResizable(false);
		// in the middle of the screen = null
		// you can hand over a Component too
		// relative to it the Frame will be set
		setLocationRelativeTo(null);
		// get frame on the needed size and show it
		// pack();
		setVisible(true);
	}

	private JMenuBar createMenuBar()
	{
		// create menu
		JMenuBar menubar = new JMenuBar();
		JMenu Spiel = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu options = new JMenu("Options");
		JMenu help = new JMenu("Help");
		// getActionCommand() sends the text of the JMenuItems
		JMenuItem Exit = new JMenuItem("Exit");
		edit.addSeparator();
		// Menulistener
		addMenuListener(Exit);

		//Hotkeys
		
		Exit.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_ESCAPE, 0));

		
		// get everything in the right menu
		Spiel.add(Exit);
		menubar.add(Spiel);

		menubar.add(edit);
		menubar.add(options);
		menubar.add(help);
		// change menubar colour to green
		menubar.setBackground(Color.green);
		// return the menubar
		return menubar;
	}

	/**
	 * give JMenuItems MenuListener a MenuListener for actions
	 * 
	 * @param menu
	 *            the requested JMenuItem for a Listener
	 */
	private void addMenuListener(JMenuItem menu)
	{
		menu.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e)
			{
				menuEingabe(e.getActionCommand());
			}
		});
	}

	/**
	 * manage the menuinput
	 * 
	 * @param s
	 */
	private void menuEingabe(String s)
	{
		if (s.equals("Exit"))
		{
			this.dispose();
		}
	}

	//zu testzwecken
	public static void main(String[] args)
	{
		new GUI();
	}
	
}
