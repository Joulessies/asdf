class IDManager {

    static class TreeNode {
        int id;
        TreeNode left, right;

        public TreeNode(int id) {
            this.id = id;
            left = right = null;
        }
    }

    private TreeNode root;

    public IDManager() {
        root = null;
    }

    public void insertID(int id) {
        if (id < 1 || id > 29) {
            System.out.println("ID must be between 1 and 29. ID " + id + " is invalid.");
            return;
        }
        root = insertRecursive(root, id);
    }

    private TreeNode insertRecursive(TreeNode node, int id) {
        if (node == null) {
            return new TreeNode(id);
        }
        if (id < node.id) {
            node.left = insertRecursive(node.left, id);
        } else if (id > node.id) {
            node.right = insertRecursive(node.right, id);
        }
        return node;
    }

    public void inOrderTraversal() {
        inOrderHelper(root);
        System.out.println();
    }

    private void inOrderHelper(TreeNode node) {
        if (node != null) {
            inOrderHelper(node.left);
            System.out.print(node.id + " ");
            inOrderHelper(node.right);
        }
    }

    public void preOrderTraversal() {
        preOrderHelper(root);
        System.out.println();
    }

    private void preOrderHelper(TreeNode node) {
        if (node != null) {
            System.out.print(node.id + " ");
            preOrderHelper(node.left);
            preOrderHelper(node.right);
        }
    }

    public void postOrderTraversal() {
        postOrderHelper(root);
        System.out.println();
    }

    private void postOrderHelper(TreeNode node) {
        if (node != null) {
            postOrderHelper(node.left);
            postOrderHelper(node.right);
            System.out.print(node.id + " ");
        }
    }

    public void displayTraversals() {
        System.out.println("In-order traversal: ");
        inOrderTraversal();
        System.out.println("Pre-order traversal: ");
        preOrderTraversal();
        System.out.println("Post-order traversal: ");
        postOrderTraversal();
    }

    public static void main(String[] args) {
        IDManager manager = new IDManager();
        manager.insertID(10);
        manager.insertID(5);
        manager.insertID(15);
        manager.insertID(3);
        manager.insertID(8);
        manager.insertID(20);
        manager.insertID(30);
        manager.displayTraversals();
    }
}
