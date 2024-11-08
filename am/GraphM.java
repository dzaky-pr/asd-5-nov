package am;

public class GraphM {
    int g [][];
    int size;
    String label [];
    
    
    //constructors
    GraphM(int s){
        this.size = s;
        g = new int[s][s];
    }
    
    GraphM(int s, String [] l){
        this.size = s;
        g = new int[s][s];
        this.label = l;
    }
    
    //add edge
    void addEdge(int v1, int v2){
        g[v1][v2]=1;
        g[v2][v1]=1;
    }
    
    //print the graph
    public String toString(){
        String output="";
        
        for(int i=0;i<g.length;i++){
            output+= label[i]+ "-->";
            for(int j=0; j<g[0].length;j++){
                if(g[i][j]==1){
                    output+= label[j]+" ";
                }
            }
            output+="\n";
        }
        
        return output;
    }

    public static void main(String[] args) {
        GraphM g = new GraphM(4, new String[]{"A", "B", "C", "D"});

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);

        System.out.print(g.toString());
    }
}
