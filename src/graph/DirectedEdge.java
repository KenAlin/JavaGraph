package graph;

/**
 * Created by Team Quetzal on 23/03/2016.
 */
public class DirectedEdge extends Edge {

    /**
     * Create a new directed edge.
     * @param origin : Origin of the edge
     * @param destination : Destination of the edge
     */
    public DirectedEdge(Vertex origin, Vertex destination) {
        this.origin = origin;
        this.destination = destination;
    }
}
