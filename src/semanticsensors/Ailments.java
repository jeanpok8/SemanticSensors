import java.io.IOException;
import java.util.Scanner;

/**
 * @author bambanza
 *
 */
public class Ailments extends Queriable {

	static Scanner scan = new Scanner(System.in);

	/* (non-Javadoc)
	 * @see Refactor.Queriable#queriable()
	 */
	public void queriable() throws IOException{
		Reasoner reasoner=new Reasoner();
		reasoner.mediumQuery("Infirmity");
		String result = scan.next();
		reasoner.disease(result);
		String result1 = scan.next();
		reasoner.simpleQuery(result1);
		String attr = scan.next();
		reasoner.complexeQuery(attr);
		scan.close();
	}
}
