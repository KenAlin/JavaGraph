package graph;

/**
 * Created by Team Quetzal on 23/03/2016.
 */
public class UndirectedEdge extends Edge {
    /**
     * Create a new directed edge.
     * @param origin : Origin of the edge
     * @param destination : Destination of the edge
     */
    public UndirectedEdge(Vertex origin, Vertex destination) {
        this.origin = origin;
        this.destination = destination;
    }


}
