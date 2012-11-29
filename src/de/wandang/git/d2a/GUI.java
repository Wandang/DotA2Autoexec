package de.wandang.git.d2a;




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
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// create Labels
		output = new JLabel("  ");
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
		JMenu Spiel = new JMenu("Game");

		JMenu edit = new JMenu("Edit");
		JMenu options = new JMenu("Options");
		JMenu help = new JMenu("Help");
		// getActionCommand() sends the text of the JMenuItems
		JMenuItem neuSpiel = new JMenuItem("new Game");
		JMenuItem Undo = new JMenuItem("Undo");
		JMenuItem Help = new JMenuItem("Help");
		JMenuItem Redo = new JMenuItem("Redo");
		JMenuItem About = new JMenuItem("About");
		JMenuItem Exit = new JMenuItem("Exit");
		JMenuItem size = new JMenuItem("custom size");
		JMenuItem color = new JMenuItem("custom colour");
		JMenuItem normal = new JMenuItem("normal mode");
		JMenuItem hide = new JMenuItem("hide mode");
		JMenuItem raster = new JMenuItem("Rastercolour");
		edit.addSeparator();
		// Menulistener
		addMenuListener(neuSpiel);
		addMenuListener(Undo);
		addMenuListener(Help);
		addMenuListener(About);
		addMenuListener(Redo);
		addMenuListener(Exit);
		addMenuListener(size);
		addMenuListener(color);
		addMenuListener(normal);
		addMenuListener(hide);
		addMenuListener(raster);

		// more Hotkeys
		neuSpiel.setAccelerator(KeyStroke.getKeyStroke("F2"));
		Exit.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_ESCAPE, 0));
		Undo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,
				ActionEvent.CTRL_MASK));
		Redo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y,
				ActionEvent.CTRL_MASK));
		Help.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,
				ActionEvent.SHIFT_MASK));
		size.setAccelerator(KeyStroke.getKeyStroke("F5"));
		color.setAccelerator(KeyStroke.getKeyStroke("F6"));
		raster.setAccelerator(KeyStroke.getKeyStroke("F7"));
		// get everything in the right menu
		Spiel.add(neuSpiel);
		Spiel.addSeparator();
		Spiel.add(Undo);
		Spiel.add(Redo);
		Spiel.addSeparator();
		Spiel.add(Exit);
		edit.add(size);
		edit.add(color);
		edit.addSeparator();
		options.add(raster);
		options.addSeparator();
		options.add(normal);
		options.add(hide);
		help.add(Help);
		help.add(About);
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
		if (s.equals("new Game"))
		{

		}
	}

}
