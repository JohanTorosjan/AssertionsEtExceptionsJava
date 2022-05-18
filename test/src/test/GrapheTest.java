package test;
import graph.*;
import org.junit.Assert;
import org.junit.Test;

public class GrapheTest {
	@Test
	public void addVertexTEST() throws GraphException{
		//Given
		Vertex Vertex1 = new Vertex("Vertex1 info", Color.WHITE);
		IncidenceArrayGraph graph=new IncidenceArrayGraph(2);
		//When
		try{
			graph.addVertex(Vertex1);
			//Then
			Assert.assertEquals(1, graph.getVertices().length-1);
		}
		catch(GraphException ge){
			throw ge;
		}
	}

	@Test(expected = GraphException.class)
	public void addVertexExceptionTEST() throws GraphException{
		Vertex Vertex1 = new Vertex("Vertex1 info", Color.WHITE);
		Vertex Vertex2 = new Vertex("Vertex1 info", Color.WHITE);
		Vertex Vertex3 = new Vertex("Vertex1 info", Color.WHITE);
		IncidenceArrayGraph graph=new IncidenceArrayGraph(2);
		try{
			graph.addVertex(Vertex1);
			graph.addVertex(Vertex2);
			graph.addVertex(Vertex3);
			
		}
		catch(GraphException ge){
			throw ge;
		}
	}





}