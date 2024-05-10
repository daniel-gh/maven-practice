package clinic.programming.training;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author Daniel LXX
 *
 */
public class Application {

	public int countWords(String words) {
		String[] separateWords = StringUtils.split(words, ' ');
		return (separateWords == null) ? 0 : separateWords.length;
	}
	
	public Application() {
        System.out.println ("Inside Application");
       
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
    	Application app = new Application();
    	/**
    	 * 
    	 */
		int sum = 0;
		for (int i=0; i<5 ;  i++) {
			sum += i;
		}
		
		app.countWords("Hello World Maven");
    }
}