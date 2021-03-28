public class DeepFirstSearch {
    public static void main(String[] args) {
        Tree first = new Tree(new Tree(new Tree(2),
                new Tree(new Tree(5), new Tree(11),6),7),
                new Tree(null, new Tree(new Tree(4),null,9),5), 2);
        int sum = first.SumTree();
        System.out.println("После полного обхода дерева в глубину его сумма равна: " + sum);
    }
}
