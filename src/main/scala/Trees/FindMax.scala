package Trees



object FindMax {
  
    def findMax(t: BinaryTree[Int], max: Int) : Int =
        var currentMax: Int = max
        t match {
            case Branch(branchLeft, value, branchRight) => {
                currentMax = findMax(branchLeft, currentMax.max(value))

                currentMax = findMax(branchRight, currentMax.max(value))
            }
            case Leaf(value) => currentMax.max(value)
        }
        currentMax
}
