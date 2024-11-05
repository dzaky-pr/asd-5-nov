package al;
import java.util.*;

public class GraphL {
    Map<String, ArrayList<String>> g;

    GraphL() {
        g = new TreeMap<>();
    }

    void addEdge(String v1, String v2){
        ArrayList<String> al = g.get(v1);
        if(al == null){
            al = new ArrayList<>();
            al.add(v2);
            g.put(v1, al);
        } else {
            al.add(v2);
        }

        ArrayList<String> al2 = g.get(v2);
        if(al2 == null){
            al2 = new ArrayList<>();
            al2.add(v1);
            g.put(v2, al2);
        } else {
            al2.add(v1);
        }
    }

    public String toString(){
        String output = "";
        for (String key : g.keySet()) {
            output += key + ": ";
            for (String value : g.get(key)) {
                output += value + " ";
            }
            output += "\n";
        }
        return output;
    }

    public static void main(String[] args) {
        GraphL g = new GraphL();

        g.addEdge("A", "B");
        g.addEdge("A", "C");
        g.addEdge("B", "C");
        g.addEdge("B", "D");
        g.addEdge("C", "D");
        g.addEdge("C", "E");
        g.addEdge("D", "E");


        System.out.print(g.toString());
    }
}
