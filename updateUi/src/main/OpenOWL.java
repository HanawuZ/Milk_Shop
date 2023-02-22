// Package 
package main;

//Imports
import org.apache.jena.ontology.OntModel;

import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.FileManager;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Saidi Ali-(+216) 22790538 or (+216) 50 590 538 -Tunisia
 */
// Class OpenOWL
class OpenOWL {
    static String s;

    // Method for opening owl file.
    static OntModel OpenConnectOWL() {

        // Initialize Ontology object 
        OntModel mode = null;
        mode = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM_RULE_INF);
        
        // Open owl file
        java.io.InputStream in = FileManager.get().open("./src/main/computer_final.owl"); // be sure file into c:\
        
        // If cannot open .owl file then throw illegal argument.
        // This mean .owl file isn't exists
        if (in == null) {
            throw new IllegalArgumentException("Fichier ontology introuvable");
        }

        // Return Ontology model object with read mode
        return (OntModel) mode.read(in, "");
    }

    // Connected to the OWL File and returning the Jena ResultSet
    static org.apache.jena.query.ResultSet ExecSparQl(String Query) {

        // Create a SPARQL query from the given string.
        // สร้างคำสั่ง query SPARQL จากสตริงที่รับมา
        org.apache.jena.query.Query query = QueryFactory.create(Query);
        
        // Create a QueryExecution to execute over the Model.
        // ประกาศ inteface qe ประเภท QueryExecution เพื่อใช้งานในการนำคำสั่ง query ไปทำงานบนโมเดล owl
        QueryExecution qe = QueryExecutionFactory.create(query, OpenConnectOWL());
        
        // Execute select query command
        org.apache.jena.query.ResultSet results = qe.execSelect();
        // System.out.println("test " + ResultSetFormatter.asText(results, (Prologue)
        // qe));
        // ();

        return results;

    }

    // Connected to the OWL File and return the String
    static String GetResultAsString(String Query) {

        // Initialize try catch exception
        try {

            org.apache.jena.query.Query query = QueryFactory.create(Query);
            QueryExecution qe = QueryExecutionFactory.create(query, OpenConnectOWL());
            org.apache.jena.query.ResultSet results = qe.execSelect();
            
            // Check if results have another result
            if (results.hasNext()) {

                // ประกาศ object ByteArrayOutputStream เพื่อเก็บผลลัพธ์ ___ ในรูปของอาเรย์ของ byte
                ByteArrayOutputStream go = new ByteArrayOutputStream();
                ResultSetFormatter.out((OutputStream) go, results, query);
                // String s = go.toString();
                // retouner les resultat de recherche (String ) ;)
                s = new String(go.toByteArray(), "UTF-8");
            } else {
                // si rien trouvé => pour le test
                s = "rien";
            }
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(OpenOWL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

}
// End