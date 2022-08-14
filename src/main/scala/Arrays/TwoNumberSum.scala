package Arrays

import scala.collection.mutable.HashMap
import scala.collection.immutable._
import scala.Some

object TwoNumberSum {
  
    def twoNumberSum(array : Array[Int], target : Int) : Array[Int] =
        val mapOfTwoNumbers = HashMap[Int, Int]()
        for (el: Int <- array){
            val x = target - el
            mapOfTwoNumbers.get(x) match //get returns an Option type, which can either contain Some or None
                case None => mapOfTwoNumbers.put(x, el)
                case Some(el) => return Array(el, x)
        }
        Array()
}
