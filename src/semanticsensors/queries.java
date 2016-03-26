package ontology;

/**
 * @author bambanza
 * 
 * A class that contains queries. 
 *
 */
public class queries {
	
	static String scenario1=
			"PREFIX ssn: <http://purl.oclc.org/NET/ssnx/ssn#>\n" +
	        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
			"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + "\n" +
	        
			"SELECT ?Scenario1Sensors \n" + 
			"WHERE {\n" +
			"ssn:Scenario1 ssn:hasSensors ?Scenario1Sensors. \n"+"}";
	
	static String scenario2=
			"PREFIX ssn: <http://purl.oclc.org/NET/ssnx/ssn#>\n" +
	        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
			"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + "\n" +
	        
			"SELECT ?Scenario2Sensors \n" + 
			"WHERE {\n" +
			"ssn:Scenario1 ssn:hasSensors ?Scenario2Sensors. \n"+"}";
	
	static String scenario3=
			"PREFIX ssn: <http://purl.oclc.org/NET/ssnx/ssn#>\n" +
	        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
			"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + "\n" +
	        
			"SELECT ?Scenario3Sensors \n" + 
			"WHERE {\n" +
			"ssn:Scenario3 ssn:hasSensors ?Scenario3Sensors. \n"+"}";
	
	
	
	static String TimeCritical=
			"PREFIX ssn: <http://purl.oclc.org/NET/ssnx/ssn#>\n" +
	        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
			"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + "\n" +
	        "SELECT ?TimeCritical \n" + 
			"WHERE {\n" +
			"ssn:TimeCritical ssn:isLocationOf ?TimeCritical. \n"+"}";	
	
	
	static String NoTimeCritical=
			"PREFIX ssn: <http://purl.oclc.org/NET/ssnx/ssn#>\n" +
	        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
			"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + "\n" +
	        "SELECT ?TimeCritical \n" + 
			"WHERE {\n" +
			"ssn:NoTimeCritical ssn:isLocationOf ?TimeCritical. \n"+"}";

	static String TrafficRateHigh=
			"PREFIX ssn: <http://purl.oclc.org/NET/ssnx/ssn#>\n" +
	        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
			"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + "\n" +
	        "SELECT ?TrafficRateHigh \n" + 
			"WHERE {\n" +
			"ssn:TrafficRateHigh ssn:hasSensorDataRange ?TrafficRateHigh. \n"+"}";
	
	static String TrafficRateMedium=
			"PREFIX ssn: <http://purl.oclc.org/NET/ssnx/ssn#>\n" +
	        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
			"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + "\n" +
	        "SELECT ?TrafficRateMediumSensors \n" + 
			"WHERE {\n" +
			"ssn:TrafficRateMedium ssn:hasSensorDataRange ?TrafficRateMediumSensors. \n"+"}";
	
	static String TrafficRateLow=
			"PREFIX ssn: <http://purl.oclc.org/NET/ssnx/ssn#>\n" +
	        "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>" +
			"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>" + "\n" +
	        "SELECT ?TrafficRateLowSensors \n" + 
			"WHERE {\n" +
			"ssn:TrafficRateMedium ssn:hasSensorDataRange ?TrafficRateLowSensors. \n"+"}";
	
}
