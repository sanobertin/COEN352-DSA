import java.util.ArrayList;

public class Tree {
    private String root;
    private ArrayList<Tree> node;

    public Tree(String root_name) {
        this.root = root;
        this.node = new ArrayList<>();
    }
    public Boolean isEmpty(){
        if(this.node.size() == 0){ return true;} else return false;
    }

    public void addChild(Tree child) {
        node.add(child);
    }

    public void removeChild(Tree child) {
        node.remove(child);
    }

    public int numChildren() {
        return node.size();
    }
    public Tree getChild(int index) {
        return node.get(index);
    }
    public void printTree(){

    }

    public static void main(String[] args) {
        Tree dept = new Tree("ECE");
        dept.addChild(new Tree("ELEC"));
        dept.addChild(new Tree("COEN"));
        // ELEC
        dept.getChild(0).addChild(new Tree("2xx"));
        dept.getChild(0).addChild(new Tree("3xx"));
        dept.getChild(0).addChild(new Tree("4xx"));
        //COEN
        dept.getChild(1).addChild(new Tree("2xx"));
        dept.getChild(1).addChild(new Tree("3xx"));
        dept.getChild(1).addChild(new Tree("4xx"));
        // end of my sampling here

        // visualize my tree with an iterator

    }
}