package graph;

import java.util.Arrays;

public class TestGraphImpl {
    public static void main(String[] args) throws IllegalArgumentException{
        Vertex Vertex1 = new Vertex("Vertex1 info", Color.WHITE);
        Vertex Vertex2 = new Vertex("Vertex2 info", Color.RED);
        Vertex Vertex3 = new Vertex("Vertex3 info", Color.BLUE);
        Vertex Vertex4 = new Vertex("Vertex3 info", Color.BLUE);
        
        IncidenceArrayGraph Graph = new IncidenceArrayGraph(3);

        try{
            Graph.addVertex(Vertex1);
            Graph.addVertex(Vertex2);
            Graph.addVertex(Vertex3);
            Graph.addVertex(Vertex4);
            
            Graph.addEdge(Vertex1,Vertex2,EdgeKind.UNDIRECTED);
            Graph.addEdge(Vertex2,Vertex3,EdgeKind.UNDIRECTED);
        }
        catch(GraphException gException){
            System.out.println(gException);
        }
        System.out.println(Arrays.toString(Graph.getVertices()));
        System.out.println(Graph.isConnected(Vertex1,Vertex2));
        System.out.println(Graph.isConnected(Vertex1,Vertex3));

    }
}