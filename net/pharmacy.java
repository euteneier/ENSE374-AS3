package network;

public class pharmacy
{
	private String name;
	private String host;
	private int port
	
	public pharmacy()
	{
		name = "";
		host = "";
		port = 0;
	}
	
	public pharmacy(String n, String h, int p)
	{
		name = n;
		host = h;
		port = p;
	}

	public String getName()
	{
		return name;
	}
	
	public String getHost()
	{
		return host;
	}
	
	public int getPort()
	{
		return port;
	}
}