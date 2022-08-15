package Trees



object FindMax {
    /**
      * Precondition: BinaryTree has at least a node/leaf
      *
      * @param t 
      * @param max
      * @return
      */
    def findMax(t: BinaryTree[Int], max: Int) : Int =
        var currentMax: Int = max
        t match {
            case Branch(branchLeft, value, branchRight) => {
                currentMax = findMax(branchLeft, currentMax.max(value))

                currentMax = findMax(branchRight, currentMax.max(value))
            }
            case Leaf(value) => {
                currentMax = currentMax.max(value)
            }
        }
        currentMax
}
