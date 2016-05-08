package Refactor;

package semanticsensors
import java.io.IOException;
import java.util.Scanner;

/**
 * @author bambanza
 *
 */
public class Technical extends Queriable {
static Scanner scan = new Scanner(System.in);

/* (non-Javadoc)
 * @see Refactor.Queriable#queriable()
 */
public void queriable() throws IOException {
	Reasoner reasoner=new Reasoner();
	reasoner.mediumQuery("IReMHO");
	String test=scan.next();
	reasoner.disease(test);
	String result = scan.next();
	reasoner.simpleQuery(result);
	String attr = scan.next();
	reasoner.complexeQuery(attr);
	scan.close();
}

}
