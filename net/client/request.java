package network;

import java.net.*;

public class request
{
	private pharmacy destination;
	private photo prescription;
	
	public request()
	{
		destination = null;
		photo = null;
	}
	
	public request(pharmacy destination)
	{
		this.destination = destination;
		photo = null;
	}
	
	public bool send()
	{
		Socket s = new Socket();
         
        try 
        {
			s.connect(new InetSocketAddress(destination.getHost() , destination.getPort());
             
			ObjectOutputStream outToServer = new ObjectOutputStream(s.getOutputStream())
			//writer for socket
            outToServer.writeObject(prescription);
			
			//TODO: Implement cleaner class to send over internet.
			
			return true;
        }
         
        //Host not found
        catch (UnknownHostException e) 
        {
            return false;
        }
	}
}