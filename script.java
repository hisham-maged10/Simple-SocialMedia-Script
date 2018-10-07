import java.awt.Desktop.Action;
import java.awt.Desktop;
import java.net.URI;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
public class script
{
	public static void main(String[] args) throws URISyntaxException,IOException
	{
		if(Desktop.isDesktopSupported())
		{
			if(Desktop.getDesktop().isSupported(Desktop.Action.BROWSE))
			{
				Desktop.getDesktop().browse(new URI("www.facebook.com"));
				Desktop.getDesktop().browse(new URI("www.coursera.org"));
				Desktop.getDesktop().browse(new URI("www.youtube.com"));
				Desktop.getDesktop().browse(new URI("https://github.com/hisham-maged10?tab=repositories"));
				
			}else
			System.out.println("Can't open browser!");
			
		}
		else
		System.out.println("Desktop not supported");	
	
	}

}