public class Tree {
    Tree left; //левая ветка дерева

    Tree right; // правая ветка дерева

    int value; //значение

    public Tree(int value){
        this.value = value;          //конструктор для ветки у которой нет левого и правого конца
    }

    public Tree(Tree left, Tree right, int value){
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public  int SumTree(){
        int sum = value;
        if (left!= null){
            sum += left.SumTree();
        }
        if (right != null){
            sum += right.SumTree();
        }
        return sum;
    }
}
