package mustafa.com;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App 
{
	private static final Logger logger = Logger.getLogger(App.class.getName());
	App()
	{
	
	}
	public static void main( String[] args )
    {
		logger.log(Level.FINE, "This is my updated greeting : Hello People");
    }
}
