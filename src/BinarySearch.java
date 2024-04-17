public class BinarySearch {
    public static boolean contains(MyNode root, int value) {
        if (root == null) {
            return false;
        }
        if (root.value == value) {
            return true;
        } else if (root.value < value) {
            return contains(root.right, value);
        } else {
            return contains(root.left, value);
        }

    }
}