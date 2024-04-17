public class Main {
    public static void main(String[] args) {
        MyNode n1 = new MyNode(1, null, null);
        MyNode n3 = new MyNode(3, null, null);
        MyNode n2 = new MyNode(2, n1, n3);

        System.out.println(BinarySearch.contains(n2, 3));
    }

}
