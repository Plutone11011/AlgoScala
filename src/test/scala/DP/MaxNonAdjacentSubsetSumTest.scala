package DP

import org.scalatest.flatspec.AnyFlatSpec
import scala.collection.immutable.ArraySeq

class MaxNonAdjacentSubsetSumTest extends AnyFlatSpec{
  

    "A non adjacent subset sum" should "return 0 for an empty array" in {

        val res = MaxNonAdjacentSubsetSum.maxNonAdjacentSubsetSum(ArraySeq())
        assert(res == 0)
    }

    "A non adjacent subset sum" should "return 6 for Array (5,6)" in {

        val res = MaxNonAdjacentSubsetSum.maxNonAdjacentSubsetSum(ArraySeq(5,6))
        assert(res == 6)
    }

    "A non adjacent subset sum" should "return 200 for (60, 100, 120, 10, 20)" in {

        val res = MaxNonAdjacentSubsetSum.maxNonAdjacentSubsetSum(ArraySeq(60, 100, 120, 10, 20))
        assert(res == 200)
    }
}
