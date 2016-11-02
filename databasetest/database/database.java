package database;

import java.awt.Desktop;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.MalformedURLException;

public class database {
	
	private static void openWebpage(URI uri) {
		Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
		if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
			try 
			{
				desktop.browse(uri);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

	private static void openWebpage(URL url) {
		try {
			openWebpage(url.toURI());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
	
	private static String encode(String input) {
        StringBuilder resultStr = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (isUnsafe(ch)) {
                resultStr.append('%');
                resultStr.append(toHex(ch / 16));
                resultStr.append(toHex(ch % 16));
            } else {
                resultStr.append(ch);
            }
        }
        return resultStr.toString();
    }

    private static char toHex(int ch) {
        return (char) (ch < 10 ? '0' + ch : 'A' + ch - 10);
    }

    private static boolean isUnsafe(char ch) {
        if (ch > 128 || ch < 0)
            return true;
        return " %$&+,/:;=?@<>#%".indexOf(ch) >= 0;
    }
	
	public static void search(String searchTerm)
	{
		searchTerm = encode(searchTerm);
		searchTerm = "https://www.drugs.com/search.php?searchterm=" + searchTerm;
		try
		{
			URL searchURL = new URL(searchTerm);
			openWebpage(searchURL);
		}
		catch(MalformedURLException e)
		{
			e.printStackTrace();
		}
	}
}
