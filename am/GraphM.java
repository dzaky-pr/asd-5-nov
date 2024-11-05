package am;

public class GraphM {
    int g[][];
    int size;
    String label[];

    GraphM(int s) {
        this.size = s;
        g = new int[s][s];
    }

    GraphM(int s, String[] label) {
        this.size = s;
        g = new int[s][s];
        this.label = label;
    }

    void addEdge(int i, int j) {
        g[i][j] = 1;
        g[j][i] = 1;
    }

    public String toString(){
        String output = "";
        for (int i = 0; i < g.length; i++) {
            output += label[i] + ": ";
            for (int j = 0; j < g[0].length; j++) {
                output += g[i][j] + " ";
            }
            output += "\n";
        }
        return output;
    }

    public static void main(String[] args) {
        GraphM g = new GraphM(5, new String[]{"A", "B", "C", "D", "E"});

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);

        System.out.print(g.toString());
    }
}
