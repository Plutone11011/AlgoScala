package Trees

object TreeDepth {
    
    /**
      * 
      *
      * @param t
      * @param depths current depths, should be called with 0
      * @return sum of depths of each node in tree
      */
    def treeDepth(t: BinaryTree[Int], depths: Int): Int =
        t match 
            case Leaf(_) => depths
            case Branch(left, _, right) => depths + treeDepth(left, depths+1) + treeDepth(right, depths+1)

}
