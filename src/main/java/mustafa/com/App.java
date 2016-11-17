package mustafa.com;

import java.util.logging.Logger;

public class App 
{
	private App()
	{
	
	}
	public static void main( String[] args )
    {
        Logger logger = Logger.getLogger("App");
		logger.log(Level.FINE, "Hello World");
    }
}
