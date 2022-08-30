package Trees

import scala.collection.immutable.List
import scala.collection.immutable.Nil


object BranchSums {



    def branchSums(t: BinaryTree[Int], acc_sum: Int) : List[Int] =
        
        t match
            case Leaf(value) => List(acc_sum + value)
            case Branch(left, value, right) =>  branchSums(left, acc_sum + value) ::: branchSums(right, acc_sum + value)
        

            

}
