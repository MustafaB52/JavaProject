package mustafa.com;

import java.util.logging.Logger;

public class App 
{
	private final static Logger logger = Logger.getLogger(App.class.getName());
	private App()
	{
	
	}
	public static void main( String[] args )
    {
		logger.log(Level.FINE, "Hello World");
    }
}
