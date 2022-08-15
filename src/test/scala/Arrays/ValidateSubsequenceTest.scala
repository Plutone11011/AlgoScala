package Arrays

import org.scalatest.flatspec.AnyFlatSpec

class ValidateSubsequenceTest  extends AnyFlatSpec {

   "A ValidateSubsequence" should "return true if it finds a subsequence" in {
        val array = Array(1, 4, 98, 2, 0, 4)
        val sequence = Array(1, 2)

        assert(ValidateSubsequence.validateSubsequence(array, sequence))
   } 

   "A ValidateSubsequence" should "return false if it doesn't find a subsequence" in {
        val array = Array(1, 4, 98, 2, 0, 4)
        val sequence = Array(1, 14)

        assert(!ValidateSubsequence.validateSubsequence(array, sequence))
   } 
}
