package graph;

/**
 * Created by Team Quetzal on 23/03/2016.
 */
public interface Graph {

	public boolean hamiltonian(Graph g);
	public boolean eulerian(Graph g);
	public boolean tournoi(Graph g);
	public boolean cyclic(Graph g);
	public void addVertex(Vertex v);
	public void removeVertex(Vertex v);
	public int cardinal();
	public void addEdge(Edge e);
	public void removeEdge(Edge e);
}
