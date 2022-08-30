package Trees

import org.scalatest.flatspec.AnyFlatSpec

class BranchSumsTest extends AnyFlatSpec {
  
    "Branch sums" should "return [4,3]" in {
        val t = Branch(Leaf(3), 1, Leaf(2))

        val branchsums = BranchSums.branchSums(t, 0)

        assert(branchsums.sameElements(Seq(4,3)))
    }

    "Branch sums" should "return [1] for a single node with 1" in {
        val t = Leaf(1)

        val branchsums = BranchSums.branchSums(t, 0)

        assert(branchsums.sameElements(Seq(1)))
    }

    "Branch sums" should "return [16, 16, 20, 30] for this tree" in {
        /**
          *       10
          *     /     \
          *    5       8
          *  /   \   /   \
          * 1     1 2    12
          */
        val t = Branch(Branch(Leaf(1), 5, Leaf(1)), 10, Branch(Leaf(2), 8, Leaf(12)))

        val branchsums = BranchSums.branchSums(t, 0)
        println(branchsums)
        assert(branchsums.sameElements(Seq(16,16,20,30)))
    }
}
