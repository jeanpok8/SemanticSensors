package semanticsensors

import java.io.IOException;

import org.apache.jena.atlas.logging.LogCtl;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;

/**
 * @author bambanza
 *
 */
public class Reasoner {

	public static String sparqlQuery;
	public static String serviceAddress="xxx";
	public static Query query;

	/**
	 * @param sparqlQuery2sparqlQuery
	 * @return
	 * @throws IOException
	 */
	public static org.apache.jena.query.ResultSet query(String instance) throws IOException {
		LogCtl.setCmdLogging();
		query = QueryFactory.create(sparqlQuery);
        QueryExecution qe = QueryExecutionFactory.sparqlService(backendAddress, sparqlQuery);
		ResultSet results = qe.execSelect();
		return results;
	}

	/**
	 * @param medium
	 * @throws IOException
	 */
	public void mediumQuery(String medium) throws IOException {
		final long time = System.nanoTime();
		sparqlQuery = QueryEngine.subclass(medium);
		ResultSetFormatter.out(System.out, query(sparqlQuery), query);
		System.out.println("Benchmark: " + ((System.nanoTime() - time) / 1000000000.0) + "s.");
		System.out.println("SELECT ME");
	}

	/**
	 * @param pass
	 * @throws IOException
	 */
	public static void simpleQuery(String pass) throws IOException {
		final long time = System.nanoTime();
		sparqlQuery = QueryEngine.simpleQuery(pass);
		ResultSetFormatter.out(System.out, query(sparqlQuery), query);
		System.out.println("Benchmark: " + ((System.nanoTime() - time) / 1000000000.0) + "s.");
		System.out.println("SELECT ME");
	}

	/**
	 * @param attribute
	 * @throws IOException
	 */
	public static void complexeQuery(String attribute) throws IOException {
		final long time = System.nanoTime();
		sparqlQuery = QueryEngine.complexeQuery(attribute);
		ResultSetFormatter.out(System.out, query(sparqlQuery), query);
		System.out.println("Benchmark: " + ((System.nanoTime() - time) / 1000000000.0) + "s.");
	}

	/**
	 * @param disease
	 * @throws IOException
	 */
	public static void disease(String disease) throws IOException {
		final long time = System.nanoTime();
		sparqlQuery = QueryEngine.mediumQuery(disease);
		ResultSetFormatter.out(System.out, query(sparqlQuery), query);
		System.out.println("Benchmark: " + ((System.nanoTime() - time) / 1000000000.0) + "s.");
		System.out.println("OH YEAH SELECT ME ");
	}
}
