package Adjacency_Matrix;
import java.util.ArrayList;

public class Graph {
    int[][] matrix;
    ArrayList<Node> nodes;

    Graph(int size){
        nodes = new ArrayList<>();
       matrix = new int[size][size];
    }

    public void addNode(Node node){
        nodes.add(node);
    }

    public void addEdge(int src, int dst){
        //this means there is an edge between 2 nodes
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst){
        //this means that there is an edge, there is return true, else return false
        if(matrix[src][dst] == 1){  
            return true;
        }else{ 
        return false;
        }
    }

    public void print(){
        System.out.print("   ");
        for(Node node : nodes){
            System.out.print(node.data + "  ");
        }
        System.out.println();

        //this for loop iterates through the rows of the matrix
        for(int i = 0; i < matrix.length;i++){
            System.out.print(nodes.get(i).data + "  ");
            //this for loop iterates through the columns of the matrix
            for(int j = 0; j < matrix[i].length;j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
