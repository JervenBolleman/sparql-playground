package ch.isb.sib.sparql.tutorial;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.Writer;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openrdf.query.QueryEvaluationException;
import org.openrdf.query.TupleQueryResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

//import ch.isb.sib.sparql.tutorial.domain.SparqlResultFormat;
import ch.isb.sib.sparql.tutorial.service.SparqlService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class})
@WebAppConfiguration
public class SparqlServiceIntegrationTest {

	@Autowired
	private SparqlService sparqlService;

	/*@Test
	public void testQueryWithLongUrl() throws Exception {
		String query = "select ?x where { ?x rdf:type <http://example.org/tuto/ontology#Cat> . }";

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		Writer writer = new PrintWriter(out);

		sparqlService.handleSPARQLQuery(query, out, SparqlResultFormat.CSV);

		writer.flush();
		String results = out.toString().split("\n")
		Assert.assertEquals(results.split("\n").length, 3); //header + 2 rows
	}

	@Test
	public void testQueryWithNamespaces() throws Exception {
		String query = sparqlService.getPrefixesString();
		query += " select ?x where { ?x rdf:type tto:Cat . }";
		TupleQueryResult result = sparqlService.handleSPARQLQuery(query, out, SparqlResultFormat.CSV);
		Assert.assertEquals(countResults(result), 2);
	}

	@Test
	public void testFederatedQuery() throws Exception {
		String query = sparqlService.getPrefixesString();
		query += " select ?subj ?pred ?obj where { values (?subj ?pred) { (dbpedia:Harrison_Ford dbo:birthDate) (dbpedia:Harrison_Ford dbp:name) (dbpedia:Harrison_Ford dbp:occupation) } { ?subj ?pred ?obj.  }UNION{ service <http://dbpedia.org/sparql> { ?subj ?pred ?obj.}}}";
		TupleQueryResult result = sparqlService.selectQuery(query);
		Assert.assertEquals(countResults(result), 3);
	}
	
	
	@Test
	public void testCount() throws Exception {
		Long n = sparqlService.getNumberOfTriplets();
	}

	private long countResults(TupleQueryResult results) {
		try {
			long counter = 0;
			while (results.hasNext()) {
				results.next();
				counter++;
			}
			return counter;
		} catch (QueryEvaluationException e) {
			e.printStackTrace();
			return 0;
		}
	}*/

}