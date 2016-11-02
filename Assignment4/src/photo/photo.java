package photo;

import java.awt.*;
import javax.swing.*;

public class photo extends JFrame
{
	private ImageIcon image1;
	private JLabel label1;
	
	photo()
	{
		setLayout(new FlowLayout());
		image1 = new ImageIcon(getClass().getResource("best.jpg"));
		label1 = new JLabel(image1);
		add(label1);
	}
	
	public void loadPicture()
	{
		photo gui = new photo();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		gui.pack();
		gui.setTitle("best image ever");
	}
	

}