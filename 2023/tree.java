	public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){

		   if (root == null) {
            return new ArrayList<>();
        }

        ArrayList<Integer> leftPath = longestRootToLeafPath(root.left);
        ArrayList<Integer> rightPath = longestRootToLeafPath(root.right);

        if (leftPath.size() > rightPath.size()) {
            leftPath.add(root.data);
            return leftPath;
        } else {
            rightPath.add(root.data);
            return rightPath;
        }
    }
