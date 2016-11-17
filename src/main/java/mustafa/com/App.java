package mustafa.com;

import java.util.logging.Logger;

// assumes the current class is called MyLogger
//private final static Logger LOGGER = Logger.getLogger(MyLogger.class.getName());

/**
 * Hello world!
 *
 */
public class App 
{
	private App()
	{
	
	}
	public static void main( String[] args )
    {
        Logger logger = Logger.getLogger("javaLogger");
		logger.log(Level.FINE, "Hello World");
    }
}
