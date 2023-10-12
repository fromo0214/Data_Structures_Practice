package Adjacency_List;
// Adjacency List = an array/arraylist of linked lists
//                 Each LinkedList has a unique node at the head
//                 All adjacent neighbors to that node are added to that nodes's
//                 LinkedList

//                 runtime complexity to check an Edge: o(v)
//                 space complexity: O(v + e)


public class AdjacanceyListTest {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);

        graph.print();
    }
}
