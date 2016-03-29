package graph;

import java.util.ArrayList;

public class Vertex {
    private String name;
    private ArrayList<Edge> edges;
    /**on ajoutera un attribut du type de ce qu'on veut stocker dans les sommets, sinon ce projet ne sert à rien ! */

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
    @param Edge edge
    */
    private void addEdge(Edge edge){
        edges.add(edge);
    }

    
    /**
    @param Vertex vertex
    */
    public void linkUndirected(Vertex vertex){
        edges.addEdge(new edge(vertex));
        vertex.addEdge(new edge(this));
    }

    /**
    @param Vertex destination
    */

    public void linkDirectedTowards(Vertex destination){
        addEdge(new edge(destination));
    }

    /**
    @param Vertex origin
    */
    public void linkDirectedFrom(Vertex origin){
        origin.addEdge(new edge(this));
    }
}
