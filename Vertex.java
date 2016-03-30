package graph;

import java.util.ArrayList;

public class Vertex {
    private String name;
    private ArrayList<Edge> edges;
    /**on ajoutera un attribut du type de ce qu'on veut stocker dans les sommets, sinon ce projet ne sert à rien ! */

    /**
     * Create a vertex without a name.
     */
    public Vertex(){
    }

    /**
     * Create a vertex with a name (can be a letter, for example).
     * @param name : Name of the vertex
     */
    public Vertex(String name){
        this.name=name;
    }


    /** GETTERS */
    public String getName() {
        return name;
    }


    /** SETTERS */
    public void setName(String n) {
        this.name = n;
    }

    /**
     * Add an edge that comes from this vertex.
    @param Edge : New edge
    */
    private void addEdge(Edge edge){
        edges.add(edge);
    }

    
    /**
     * Add an undirected link between this vertex and another (maybe the same ?).
    @param Vertex vertex
    */
    public void linkUndirected(Vertex vertex){
        this.addEdge(new UndirectedEdge(this, vertex));
        vertex.addEdge(new UndirectedEdge(this, vertex));
    }

    /**
     * Add a link toward a vertex.
    @param Vertex destination
    */

    public void linkDirectedTowards(Vertex destination){
        addEdge(new DirectedEdge(this, destination));
    }

    /**
     * Add a directed edge that comes from a vertex, toward this one (maybe the same ?).
    @param Vertex origin
    */
    public void linkDirectedFrom(Vertex origin){
        origin.addEdge(new DirectedEdge(origin, this));
    }
}
