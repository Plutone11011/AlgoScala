package Trees

import org.scalatest.flatspec.AnyFlatSpec

class TreeDepthTest extends AnyFlatSpec{
    "A TreeDepth" should "return 0 for a single node binary tree" in {
        val btree = Leaf(1)

        assert(TreeDepth.treeDepth(btree, 0) == 0)
    }

    "A TreeDepth" should "return 2 for a 3 nodes binary tree" in {
        val btree = Branch(Leaf(1), 2, Leaf(3))

        assert(TreeDepth.treeDepth(btree, 0) == 2)
    }

    "A TreeDepth" should "return 10 for a complete binary tree of height 2" in {
        val btree = Branch(Branch(Leaf(0), 0, Leaf(0)), 2, Branch(Leaf(0), 0, Leaf(0)))

        assert(TreeDepth.treeDepth(btree, 0) == 10)
    }
}
