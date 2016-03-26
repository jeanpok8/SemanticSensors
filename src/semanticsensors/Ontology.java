package ontology;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import org.apache.jena.atlas.logging.Log;
import org.apache.jena.atlas.logging.LogCtl;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdf.model.ModelFactory;

public class Ontology {
	
	String sparqlQuery;
	static String fileName = "/home/bambanza/Pictures/ontologie/testontologies.owl";
      
	  public void query() {
	    LogCtl.setCmdLogging();
		OntModel model = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM);
		File file = new File(fileName);
		
		try {
			FileReader reader = new FileReader(file);
			model.read(reader, null);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//sparqlQuery= queries.scenario1;
		Query query = QueryFactory.create(sparqlQuery); // encapsulate a parsed query and using create() read a  textual query from a  string
        QueryExecution qe = QueryExecutionFactory.create(query, model);// a single execution of a query
	    org.apache.jena.query.ResultSet results = qe.execSelect();
	    ResultSetFormatter.out(System.out, results, query);
	}


	public void scanner() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Select and Input a number corresponding to a scenario:");
		System.out.println("");
		System.out.println("1:-SCENARIO1 SENSORS");
		System.out.println("2:-SCENARIO2 SENSORS");
		System.out.println("3:-SCENARIO3 SENSORS");
		System.out.println("");
		System.out.println("Select and Input a number corresponding to Body attachement type:");
		System.out.println("");
		System.out.println("11:-TIMECRITICAL SENSORS");
		System.out.println("12:-NO TIMECRITICAL SENSORS");
		System.out.println("");
		System.out.println("Select and Input a number corresponding to Generated data:");
		System.out.println("");
		System.out.println("21:-HIGH TRAFFIC SENSORS");
		System.out.println("22:-MEDIUM TRAFFIC SENSORS");
		System.out.println("23:-LOW TRAFFIC SENSORS");
		System.out.println("");
		System.out.println("INSERT SELECTED NUMBER HERE:");
		int numb = scan.nextInt();
		scan.close();
		
		switch (numb) {
		case 1:
			sparqlQuery = queries.scenario1;
			break;
		case 2:
			sparqlQuery = queries.scenario2;
            break;
		case 3:
			sparqlQuery = queries.scenario3;
			break;
		case 11:
			sparqlQuery=queries.TimeCritical;
			break;
		case 12:
			sparqlQuery=queries.NoTimeCritical;
			break;
		case 13:
			sparqlQuery=queries.TrafficRateHigh;
			break;
			
		case 21:
			sparqlQuery=queries.TrafficRateHigh;
			break;
		case 22:
			sparqlQuery=queries.TrafficRateMedium;
			break;
		case 23:
			sparqlQuery=queries.TrafficRateLow;
			break;
		default:
			break;
		}
	}}
