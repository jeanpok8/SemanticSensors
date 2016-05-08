/**
 * @author bambanza
 *         <p>
 *         A class that contains queries.
 */
public class QueryEngine {

	/**
	 * @param simple
	 * @return
	 */
	public static String simpleQuery(String simple) {

		return "PREFIX ssn: <http://purl.oclc.org/NET/ssnx/ssn#>\n"
				+ "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
				+ "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + "\n" + "SELECT ?Gadgets \n" + "WHERE {\n"
				+ "ssn:" + simple + " ssn:implements ?Gadgets \n" + "}";
	}

	/**
	 * @param Description
	 * @return
	 */
	public static String complexeQuery(String Description) {

		return "PREFIX ssn: <http://purl.oclc.org/NET/ssnx/ssn#>\n"
				+ "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
				+ "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + "\n"
				+ "SELECT ?Name ?Controller ?Protocol ?Description \n" + "WHERE {\n" + "ssn:" + Description
				+ " ssn:DeviceName ?Name. ssn:" + Description + " ssn:Controller ?Controller.ssn:" + Description
				+ " ssn:Protocol ?Protocol.ssn:" + Description + " ssn:Description ?Description \n" + "}";
	}

	/**
	 * @param classe
	 * @return
	 */
	public static String subclass(String classe) {

		return "PREFIX ssn: <http://purl.oclc.org/NET/ssnx/ssn#>\n"
				+ "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
				+ "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + "\n" + "SELECT ?ResultSet \n" + "WHERE {\n"
				+ "?ResultSet rdfs:subClassOf ssn:" + classe + "\n" + "}";
	}

	/**
	 * @param Desease
	 * @return
	 */
	public static String mediumQuery(String medium) {
		return "PREFIX ssn: <http://purl.oclc.org/NET/ssnx/ssn#>\n"
				+ "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
				+ "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + "\n" + "SELECT ?" + medium + " \n"
				+ "WHERE {\n" + " ?" + medium + " rdf:type ssn:" + medium + "\n" + "}";
	}

}
