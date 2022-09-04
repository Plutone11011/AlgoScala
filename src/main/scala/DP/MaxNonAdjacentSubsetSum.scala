package DP

import scala.collection.immutable.ArraySeq
import scala.collection.mutable.ArrayBuffer
import scala.math._

object MaxNonAdjacentSubsetSum {
  
    def maxNonAdjacentSubsetSum(array: ArraySeq[Int]) : Int =
        if array.size == 0 then return 0
        
        val maxSubsetSum = ArrayBuffer[Int]()
        for i <- 0 until array.size
        do {
        
            if i == 0 then
                maxSubsetSum.insert(i, array(i))
            else if i == 1 then
                maxSubsetSum.insert(i, max(array(i), array(i-1)))
            else
                maxSubsetSum.insert(i, max(maxSubsetSum(i - 1), maxSubsetSum(i-2) + array(i)))

        }
        maxSubsetSum(maxSubsetSum.size - 1)
        
        

}
