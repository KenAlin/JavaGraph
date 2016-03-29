package graph;

import java.util.ArrayList;

public class Vertex {
    private String name;
    private ArrayList<Edge> edges;

    /** GETTERS */
    public String getName() {
        return name;
    }


    /** SETTERS */
    public void setName(String n) {
        this.name = n;
    }
}
