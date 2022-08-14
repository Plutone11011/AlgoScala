package Arrays

import org.scalatest.flatspec.AnyFlatSpec

//BBD testing
class TwoNumberSumTest extends AnyFlatSpec {
  "A TwoNumberSum" should "return the index of the 2 elements that sum up to target" in {
    val l = Array(1, 4, 98, 2, 0, 4)
    assert(TwoNumberSum.twoNumberSum(l, 6).sameElements(Array(4,2)))
  }


  "A TwoNumberSum" should "return the index of the 2 elements that sum up to target" in {
    val l = Array(1, 4, 98, 2, 0, 4)
    assert(TwoNumberSum.twoNumberSum(l, 100).sameElements(Array(98,2)))
  }

  "A TwoNumberSum" should "return the index of the 2 elements that sum up to target" in {
    val l = Array[Int]()
    assert(TwoNumberSum.twoNumberSum(l, 100).sameElements(Array[Int]()))
  }

  "A TwoNumberSum" should "return the index of the 2 elements that sum up to target" in {
    val l = Array[Int](1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    assert(TwoNumberSum.twoNumberSum(l, 100).sameElements(Array[Int]()))
  }
}   
