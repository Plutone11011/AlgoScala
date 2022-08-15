package Trees

import org.scalatest.flatspec.AnyFlatSpec


class FindMaxTest extends AnyFlatSpec {
  "A FindMax" should "find the maximum value in a binary tree" in {
    val btree = Branch(
                    Branch(Leaf(3), 17, Leaf(9)), 5, 
                        Branch(
                        Branch(Leaf(6), 8, Leaf(11)), 2, Leaf(1)
                        )
            )
    
    assert(FindMax.findMax(btree, Int.MinValue) == 17)
    
  }

  "A FindMax" should "return the value of a single node binary tree" in {
    val btree = Leaf(0)

    assert(FindMax.findMax(btree, Int.MinValue) == 0)
  }
}
