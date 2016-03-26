package JenaTest;

import java.beans.Statement;

import org.apache.jena.atlas.logging.LogCtl;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.vocabulary.VCARD;

public class Tutorial1 extends Object{

	static String personURI="http://somewhere/JohnSmith";
    static String fullName="John Smith";
    static String givenName= "John";
    static String Prenoun= "Smith";
	
	public static void main(String args[]){
	LogCtl.setCmdLogging();
	 Model model = ModelFactory.createDefaultModel();
	// create the resource
     Resource johnSmith = model.createResource(personURI);
     johnSmith.addProperty(VCARD.FN,fullName);
     johnSmith.addProperty(VCARD.Given,givenName);
     johnSmith.addProperty(VCARD.Family, Prenoun);
    
     StmtIterator iter = model.listStatements();
     
     while(iter.hasNext()){
    	
    	   org.apache.jena.rdf.model.Statement stmt  = iter.nextStatement();  // get next statement
    	    Resource  subject   = stmt.getSubject();     // get the subject
    	    Property  predicate = stmt.getPredicate();   // get the predicate
    	    RDFNode   object    = stmt.getObject();      // get the object
    	    System.out.print(subject.toString());
    	    System.out.print(" " + predicate.toString() + " ");
    	  
    	    if (object instanceof Resource) {
    	       System.out.print(object.toString());
    	    } else {
    	        // object is a literal
    	        System.out.print(" \"" + object.toString() + "\"");
    	    }
                System.out.println(" .");
    	 
     }
	
	}
}
