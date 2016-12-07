package photo;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;

public class photo extends JFrame
{
	private BufferedImage image1;
	private JFrame label1;
	
	photo()
	{
		setLayout(new FlowLayout());
		label1 = new JFrame("Image");
		image1 = ImageIO.read(new File(drugImages));
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