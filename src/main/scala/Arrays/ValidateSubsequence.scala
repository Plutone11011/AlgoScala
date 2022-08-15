package Arrays

object ValidateSubsequence {
    
    /**
      * Checks that non-empty sequence is a subsequence of a non-empty array (not necessarily adjacent)
      *
      * @param array
      * @param sequence
      * @return
      */
    def validateSubsequence(array: Array[Int], sequence: Array[Int]) : Boolean =

        if array.size < sequence.size then 
            return false

        var seqIndex: Int = 0 
        for (el <- array){

            if seqIndex == sequence.size then
                return true

            if sequence(seqIndex) == el then {

                seqIndex += 1
            }

        }
        false
}
