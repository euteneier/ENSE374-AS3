package photo;

import java.io. *;
import java.net. *;
import java.util.*;

public class photo 
{
	public static void getImage(String imageURL, String destination) throws IOException
	{
		URL link = new URL(imageURL);
		InputStream input = link.openStream();
		OutputStream output = new FileOutputStream(destination);
		
		byte[] by = new byte[2048];
		int length;
		
		while((length = input.read(by)) != -1)
		{
			output.write(by, 0, length);
		}
		
		input.close();
		output.close();
	}
	
	public static void loadPicture() throws Exception
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please Input the URL to the image you would like to upload.");
		String input = in.nextLine();
		System.out.println("Please name the photo");
		String name = in.nextLine();
		String folderLocation = null;
		System.out.println("Please enter the destination folder.");
		folderLocation = in.nextLine();
		String imageLink = input;
		String destinationFile = folderLocation + name + ".jpg";
		
		getImage(imageLink, destinationFile);	
		
		System.out.print("Image has been loaded into destination folder.");
		in.close();
	}
}
